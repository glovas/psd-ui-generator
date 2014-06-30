package hu.bme.mit.mobilgen.layoutgenerator.psdprocessor;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import psdstructure.View;

public class ModelExporter {
		
	public static void export(View model, IProject project) {
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("psdstructure", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // create a resource
	    IFolder genfolder = project.getFolder(PsdProcessor.outputFolder);
	    IFile output = genfolder.getFile(model.getID()+".psdstructure");
	    Resource resource = resSet.createResource(URI.createPlatformResourceURI(output.getFullPath().toString(), true));
	    
	    resource.getContents().add(model);

	    // now save the content.
	    try {
	      resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }		
		
	}
	
}
