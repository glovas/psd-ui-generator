package hu.bme.mit.mobilgen.layoutgenerator.psdprocessor;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

/**
 * Coordinates the generation process
 * @author lovas
 *
 */
public class PsdProcessor {
	
	private IFile psdFile;
	private IProject project;
	public static final String outputFolder = "psd-gen";
	
	public String getPsdName() {
		return psdFile.getName();
	}
	
	public IFile getPsdFile(){
		return psdFile;
	}
	
	public void setPsdFile(IFile psdFile) {
		this.psdFile = psdFile;
	}

	public String getOutputFolder() {
		return outputFolder;
	}
	
	public PsdProcessor(IFile res, IProject project) {
		psdFile = res;
		this.project = project;
	}

	/**
	 * Generates platform independent output into the output folder
	 * @throws PSDException 
	 */
	public void process(){
		try {
			NodeReader r = new NodeReader(this.psdFile, project);
			r.read();
		}  catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}	
}
