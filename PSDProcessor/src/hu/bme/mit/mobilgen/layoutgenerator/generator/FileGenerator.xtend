package hu.bme.mit.mobilgen.layoutgenerator.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.core.resources.IProject

abstract class FileGenerator {
	
	protected IProject project;
	
	new (IProject p) {
		project = p
	}
	
	def void generate(Resource res);
	def void save(String filename);
}
