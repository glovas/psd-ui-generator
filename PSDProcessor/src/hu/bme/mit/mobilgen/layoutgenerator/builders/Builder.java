package hu.bme.mit.mobilgen.layoutgenerator.builders;

import hu.bme.mit.mobilgen.layoutgenerator.generator.LayoutGenerator;
import hu.bme.mit.mobilgen.layoutgenerator.psdprocessor.PsdProcessor;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class Builder extends IncrementalProjectBuilder {

	public static final String BUILDER_ID = "hu.bme.mit.mobilgen.layoutgenerator.Builder";

	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) {
		if (kind == IncrementalProjectBuilder.FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	private void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) {
		System.out.println("incremental build on " + delta);
		try {
			delta.accept(new IResourceDeltaVisitor() {
				public boolean visit(IResourceDelta delta) {
					System.out.println("changed: "
							+ delta.getResource().getRawLocation());
					if (delta.getResource() instanceof IFile
							&& delta.getResource().getName().endsWith(".psd")) {
						PsdProcessor pp = new PsdProcessor((IFile) delta
								.getResource(), getProject());
						pp.process();
					}

					return true; // visit children too
				}
			});
		} catch (CoreException e) {
			e.printStackTrace();
		}
		LayoutGenerator.generate(getProject());
	}

	private void fullBuild(IProgressMonitor monitor) {
		
		clean(monitor);
		// get project
		IProject project = getProject();

		// check if psd folder exists and has items
		IFolder psdFolder = project.getFolder("psd");
		if (!psdFolder.exists()) {
			System.out.println("PSD folder does not exists.");
			return;
		}
		System.out.println("PSD folder exists");

		// check if folder has items
		try {
			if (psdFolder.members().length == 0) {
				System.out.println("The psd folder has no members.");
				return;
			}
			for (IResource res : psdFolder.members()) {
				if (res instanceof IFile && res.getName().endsWith(".psd")) {
					PsdProcessor pp = new PsdProcessor((IFile) res,
							getProject());
					pp.process();
				}
			}
			
			LayoutGenerator.generate(getProject());
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	protected void clean(IProgressMonitor monitor) {
		// remove all items from psd-gen folder
		System.out.println("Running clean on: " + getProject().getName());
		IProject project = getProject();
		IFolder psdFolder = project.getFolder(PsdProcessor.outputFolder);
		if (!psdFolder.exists()) {
			System.out.println("PSD folder does not exists.");
			return;
		}
		try {
			deleteFiles(psdFolder, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void deleteFiles(IFolder folder, IProgressMonitor monitor)
			throws CoreException {
		for (IResource res : folder.members()) {
			if (res instanceof IFile) {
				res.delete(true, monitor);
			} else if (res instanceof IFolder) {
				deleteFiles((IFolder) res, monitor);
			}
		}
	}

}
