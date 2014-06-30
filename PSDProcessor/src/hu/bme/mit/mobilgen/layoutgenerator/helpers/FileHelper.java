package hu.bme.mit.mobilgen.layoutgenerator.helpers;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;

public class FileHelper {

	/**
	 * Recursively creates the given folder in the project
	 * @param folder Folder to create
	 */
	public static void createFolder(IFolder folder) throws CoreException{		
		if(!folder.getParent().exists()){
			createFolder((IFolder) folder.getParent());
		}
		folder.create(false, false, null);
	}
	
}
