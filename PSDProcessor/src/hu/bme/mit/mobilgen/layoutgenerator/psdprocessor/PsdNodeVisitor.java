package hu.bme.mit.mobilgen.layoutgenerator.psdprocessor;

import psd.Layer;
import psd.LayersContainer;
import psd.Psd;
import psd.TextData;
import psdstructure.Grid;
import psdstructure.View;
import psdstructure.ViewGroup;

public class PsdNodeVisitor {
	
	private PsdStructureFactory factory = new PsdStructureFactory();
	
	public View visit(LayersContainer layer, View parent){
		
		
		LayerName processedName = LayerName.processLayerName(layer.toString());
		
		// store text data
		if(layer instanceof Layer && ((Layer)layer).isText()) {
			TextData td = ((Layer)layer).getTextData();
			processedName.getProperties().put("text", td.getText());
			processedName.getProperties().put("color", td.getColor());
			processedName.getProperties().put("fontsize", td.getFontSize()+"");
		}
		
		// set base layer data
		if(layer instanceof Psd && parent == null) {
			parent = factory.createBaseView(processedName, layer);
		}
		
		
		View view = factory.createView(processedName, layer); 
		
		if(view == null) {
			if(layer.getLayersCount() == 0){
				parent.getBackgrounds().add(factory.createBackgroundImage((Layer) layer));
			}
			return null;
		}
		else {
			if(parent instanceof ViewGroup) {
				((ViewGroup)parent).getChildren().add(view);
			}
		}
		return view;
	}
	
}
