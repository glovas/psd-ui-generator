package hu.bme.mit.mobilgen.layoutgenerator.psdprocessor;

import java.util.HashMap;
import java.util.Map;

public class LayerName {
	private String type = "";
	private String name = "";
	private Map<String, String> properties;

	public LayerName(){
		properties = new HashMap<String, String>();
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getProperties() {
		return properties;
	}
	
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	
	public void addProperty(String key, String value) {
		this.properties.put(key, value);
	}
	
	/**
	 * Processes the layer name
	 * 
	 * The layer name has to follow this structure:
	 * 	LAYER_ID--LAYER_TYPE[;PROPERTY_TYPE[:PROPERTY_VALUE]]
	 * 
	 * @param layerName
	 * @return
	 */
	public static LayerName processLayerName(String layerName){
		
		// convert to lower case, names are not case sensitive
		layerName = layerName.toLowerCase();
		
		LayerName processedName = new LayerName();
		
		if(layerName.contains("--")){
			String parts[] = layerName.split("--");
			// store id
			processedName.setName(parts[0]);
			
			if(parts.length >= 2){
				String properties[] = parts[1].split(";");
				// store type
				processedName.setType(properties[0]);
				
				if(properties.length > 1) {
					// process properties
					for (int i = 1; i < properties.length; i++) {
						if(properties[i].contains(":")){
							String pair[] = properties[i].split(":");
							processedName.addProperty(pair[0], pair[1]);
						}
						else {
							processedName.addProperty(properties[i], "");
						}
					}
				}
			}
		}
		else {
			processedName.setName(layerName.replaceAll("[^a-z0-9_]", "_"));
		}
		
		return processedName;
	}
}
