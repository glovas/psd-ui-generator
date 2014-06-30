package hu.bme.mit.mobilgen.layoutgenerator.psdprocessor;

import hu.bme.mit.mobilgen.layoutgenerator.helpers.FileHelper;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import psd.Layer;
import psd.Psd;

public class ImageExporter {
	
	public static final String folder = "images";
	
	/**
	 * Export PSD files
	 * @param container
	 * @param projectName
	 * @return
	 */
	public static boolean export(Psd container, IProject project){
		if(container.getLayersCount() > 0){
			for (int i = 0; i < container.getLayersCount(); i++) {
				export(container.getLayer(i), project);
			}
		}
		return true;
	}
	
	public static boolean export(Layer container, IProject project){
		
		BufferedImage image = container.getImage();
		LayerName name = LayerName.processLayerName(container.toString());
		
		// check if project exists
		if(!project.exists() || !project.isOpen()){
			return false;
		}
		
		// save the image
		try {
			saveImage(image, name.getName(), project);
		} catch (CoreException e) {
			return false;
		}
		
		if(container.getLayersCount() > 0){
			for (int i = 0; i < container.getLayersCount(); i++) {
				export(container.getLayer(i), project);
			}
		}
		return true;
	}
	
	public static void saveImage(BufferedImage image, String name, IProject project) throws CoreException {
		if(image == null){
			return;
		}
		IFile newfile = null;
		
		IFolder imagesFolder = project.getFolder(PsdProcessor.outputFolder + "/" +folder);
		if(!imagesFolder.exists()) {
			FileHelper.createFolder(imagesFolder);
		}
		
		// create new file
		newfile = imagesFolder.getFile(name+".png");
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		
		// write out the image
		try {
			ImageIO.write(image, "png", os);
		} catch (IOException e) {
			e.printStackTrace();
		}
		InputStream is = new ByteArrayInputStream(os.toByteArray());
		
		newfile.create(is, false, null);		
	}
	
}

