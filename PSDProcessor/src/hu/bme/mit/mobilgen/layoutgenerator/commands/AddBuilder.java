package hu.bme.mit.mobilgen.layoutgenerator.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;  
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import hu.bme.mit.mobilgen.layoutgenerator.natures.Nature;

public class AddBuilder extends AbstractHandler implements IHandler {

	/**
	 * Adds builder and nature to the project
	 */
	@Override
	public Object execute(final ExecutionEvent event) {
		final IProject project = getProject(event);
		System.out.println("Try to add the builder");
		if (project != null) {
			try {
				// get project
			    IProjectDescription desc = project.getDescription();
			    // add natures
			    String[] prevNatures = desc.getNatureIds();
			    String[] newNatures = new String[prevNatures.length + 1];
			    // the natureids array is immutable
			    System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
			    newNatures[prevNatures.length] = Nature.NATURE_ID;
			    desc.setNatureIds(newNatures);
			    project.setDescription(desc, new NullProgressMonitor());
			} catch (CoreException e) {
			    e.printStackTrace();
			}
		}

		return null;
	}

	public static IProject getProject(final ExecutionEvent event) {
		final ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			final Object element = ((IStructuredSelection) selection)
					.getFirstElement();

			return (IProject) Platform.getAdapterManager().getAdapter(element,
					IProject.class);
		}

		return null;
	}

}
