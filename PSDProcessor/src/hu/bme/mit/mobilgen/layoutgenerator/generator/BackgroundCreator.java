package hu.bme.mit.mobilgen.layoutgenerator.generator;

import org.eclipse.core.resources.IProject;

import psdstructure.View;

public abstract class BackgroundCreator {

	protected IProject project;
	
	public BackgroundCreator(IProject p) {
		project = p;
	}
	public abstract String create(View view);
}
