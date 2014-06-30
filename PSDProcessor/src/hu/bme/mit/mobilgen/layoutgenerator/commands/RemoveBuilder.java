package hu.bme.mit.mobilgen.layoutgenerator.commands;

import hu.bme.mit.mobilgen.layoutgenerator.natures.Nature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;

public class RemoveBuilder extends AbstractHandler implements IHandler {
	
	/**
	 * Removes the builder and the nature from the project
	 */
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IProject project = AddBuilder.getProject(event);

		if (project != null) {
			IProjectDescription description;
			try {
				description = project.getDescription();
				List<String> natures = Arrays.asList(description.getNatureIds());
				List<String> newNatures = new ArrayList<String>();
				
				for (String string : natures) {
					if(!string.equals(Nature.NATURE_ID)){
						newNatures.add(string);
					}
				}
				
				description.setNatureIds(newNatures.toArray(new String[newNatures.size()]));
				project.setDescription(description, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}
