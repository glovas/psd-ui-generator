/**
 * Reads the nodes from the PSD file, validates them and
 * creates the node tree
 */
package hu.bme.mit.mobilgen.layoutgenerator.psdprocessor;

import hu.bme.mit.mobilgen.layoutgenerator.psdprocessor.Validator.Validator;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

import psd.Layer;
import psd.LayersContainer;
import psd.Psd;
import psd.parser.layer.LayerType;
import psdstructure.PsdstructureFactory;
import psdstructure.View;

public class NodeReader {
	private Psd psd;
	private PsdNodeVisitor visitor;
	private View model;
	private IProject project;

	public NodeReader(IFile file, IProject project) throws IOException, CoreException {
		super();
		this.psd = new Psd(file.getContents(), file.getName().replace(".psd", ""));
		this.project = project;
	}

	/**
	 * Initializes the file processing
	 */
	public void read() {

		visitor = new PsdNodeVisitor();

		//createPsdModelContainer(psd.toString());
		model = read(psd, null);

		// validate model
		Validator validator = new Validator();
		validator.validate(model);
		if (validator.displayErrors()) {
			// there was errors in the model
			// finish processing
			return;
		}

		// export images
		ImageExporter.export(psd, project);
		
		ModelExporter.export(model, project);
		
	}
	
	/**
	 * Recursively walks the layer structure
	 * @param container
	 * @param group
	 */
	public View read(LayersContainer container, View group) {

		View child = visitor.visit(container, group);

		if (child != null) {
			for (int i = 0; i < container.getLayersCount(); i++) {
				Layer layer = container.getLayer(i);
				if (!layer.isVisible()) {
					continue;
				}

				if (layer.getType().equals(LayerType.FOLDER)) {
					read(layer, child);
				}
				else{
					visitor.visit(layer, child);
				}
			}
		}
		return child;
	}
	
	private void createPsdModelContainer(String name){
		model = PsdstructureFactory.eINSTANCE.createViewGroup();
		model.setID(name);
		model.setPos(PsdstructureFactory.eINSTANCE.createVector());
	}

}