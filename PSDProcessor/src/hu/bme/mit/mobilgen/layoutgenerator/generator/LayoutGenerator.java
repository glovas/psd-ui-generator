package hu.bme.mit.mobilgen.layoutgenerator.generator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;

import hu.bme.mit.mobilgen.layoutgenerator.generator.android.AndroidGenerator;
import hu.bme.mit.mobilgen.layoutgenerator.psdprocessor.PsdProcessor;

public class LayoutGenerator {

	public static void generate(IProject project) {
		AndroidGenerator ag = new AndroidGenerator();
		try {
			for(IResource res : project.getFolder(PsdProcessor.outputFolder).members()){
				if(res.getFileExtension() != null && res.getFileExtension().equals("psdstructure")){
					String filename = prepareFileName(res.getName());
					ag.generate(URI.createPlatformResourceURI(res.getFullPath().toString(), true), project, filename);
				}	
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}


	private static String prepareFileName(String name) {
		name = name.replace(".psdstructure", "").toLowerCase().replaceAll("[^a-z0-9_.]", "_");
		return name;		
	}

}
