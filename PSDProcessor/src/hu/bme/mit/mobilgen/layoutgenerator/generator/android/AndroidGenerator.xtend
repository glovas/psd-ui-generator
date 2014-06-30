package hu.bme.mit.mobilgen.layoutgenerator.generator.android

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.core.resources.IProject

class AndroidGenerator {

	def generate(URI file, IProject project, String filename) {
		doEMFSetup

		if (file != null && file.fileExtension != null && file.fileExtension.equals("psdstructure")) {
			val resourceSet = new ResourceSetImpl
			val resource = resourceSet.getResource(file, true)
			
			/** 
			 * Abslolute layout generation
			 * Deprecated + not paractical in most cases
			 */
			// generate Android 2.3 layout
			//val v10XmlGenerator = new V10XmlGenerator(project)
			//v10XmlGenerator.generate(resource);
			//v10XmlGenerator.save(filename);
			
			// generate layout Above 2.3
			val xmlGenerator = new XmlGenerator(project)
			xmlGenerator.generate(resource)
			xmlGenerator.save(filename)
			
			val controllerGenerator = new ControllerGenerator(project, filename)
			controllerGenerator.generate(resource)
			controllerGenerator.save(filename)
		}
	}

	def doEMFSetup() {
		Resource$Factory$Registry::INSTANCE.extensionToFactoryMap.put("psdstructure", new XMIResourceFactoryImpl);
	}

}
