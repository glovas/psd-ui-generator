package hu.bme.mit.mobilgen.layoutgenerator.natures;

import hu.bme.mit.mobilgen.layoutgenerator.builders.Builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class Nature implements IProjectNature {

	private IProject project;
	public static final String NATURE_ID = "hu.bme.mit.mobilgen.layoutgenerator.Nature";

	@Override
	public void configure() throws CoreException {		
		try {
			// verify already registered builders
			if (hasBuilder(project)){
				System.out.println("Project already has the builder");
				// already enabled
				return;
			}

			// add builder to project properties
			IProjectDescription description = project.getDescription();
			final ICommand buildCommand = description.newCommand();
			buildCommand.setBuilderName(Builder.BUILDER_ID);

			final List<ICommand> commands = new ArrayList<ICommand>();
			commands.addAll(Arrays.asList(description.getBuildSpec()));
			commands.add(buildCommand);

			description.setBuildSpec(commands.toArray(new ICommand[commands.size()]));
			project.setDescription(description, null);
			System.out.println("Builder added");
		} catch (final CoreException e) {
			// TODO could not read/write project description
			e.printStackTrace();
		}
	}

	@Override
	public void deconfigure() throws CoreException {
		try {
			final IProjectDescription description = project
					.getDescription();
			final List<ICommand> commands = new ArrayList<ICommand>();
			commands.addAll(Arrays.asList(description.getBuildSpec()));

			for (final ICommand buildSpec : description.getBuildSpec()) {
				if (Builder.BUILDER_ID.equals(buildSpec.getBuilderName())) {
					// remove builder
					commands.remove(buildSpec);
				}
			}

			description.setBuildSpec(commands.toArray(new ICommand[commands
					.size()]));
			project.setDescription(description, null);
		} catch (final CoreException e) {
			// TODO could not read/write project description
			e.printStackTrace();
		}
	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

	public static final boolean hasBuilder(final IProject project) {
		try {
			for (final ICommand buildSpec : project.getDescription()
					.getBuildSpec()) {
				if (Builder.BUILDER_ID.equals(buildSpec.getBuilderName()))
					return true;
			}
		} catch (final CoreException e) {
		}

		return false;
	}

}
