package hu.bme.mit.mobilgen.layoutgenerator.psdprocessor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;

import psd.Layer;
import psd.LayersContainer;
import psdstructure.AdView;
import psdstructure.BackgroundImage;
import psdstructure.Button;
import psdstructure.Checkbox;
import psdstructure.DatePicker;
import psdstructure.Grid;
import psdstructure.Image;
import psdstructure.Map;
import psdstructure.ProgressBar;
import psdstructure.ProgressSpinner;
import psdstructure.PsdstructureFactory;
import psdstructure.RadioButton;
import psdstructure.Scroll;
import psdstructure.Select;
import psdstructure.SelectOption;
import psdstructure.Slider;
import psdstructure.Switch;
import psdstructure.Text;
import psdstructure.Vector;
import psdstructure.View;
import psdstructure.ViewGroup;
import psdstructure.WebView;

public class PsdStructureFactory {
	
	public View createView(LayerName name, LayersContainer layer){
		
		View view = null;
		PsdstructureFactory factory = PsdstructureFactory.eINSTANCE;
		
		switch (name.getType()) {
			case LayerType.PROGRESS_SPINNER:
				view = factory.createProgressSpinner();
				initView((ProgressSpinner)view, name);
				break;
			case LayerType.ADVIEW:
				view = factory.createAdView();
				initView((AdView)view, name);
				break;
			case LayerType.BUTTON:
				view = factory.createButton();
				initView((Button)view, name);
				break;
			case LayerType.CHECKBOX:
				view = factory.createCheckbox();
				initView((Checkbox)view, name);
				break;
			case LayerType.DATEPICKER:
				view = factory.createDatePicker();
				initView((DatePicker)view, name);
				break;
			case LayerType.GRID:
				view = factory.createGrid();
				initView((Grid)view, name);
				break;
			case LayerType.IMAGE:
				view = factory.createImage();
				initView((Image)view, name);
				break;
			case LayerType.MAP:
				view = factory.createMap();
				initView((Map)view, name);
				break;
			case LayerType.PROGRESS_BAR:
				view = factory.createProgressBar();
				initView((ProgressBar)view, name);
				break;
			case LayerType.RADIOBUTTON:
				view = factory.createRadioButton();
				initView((RadioButton)view, name);
				break;
			case LayerType.SCROLL:
				view = factory.createScroll();
				initView((Scroll)view, name);
				break;
			case LayerType.SELECT:
				view = factory.createSelect();
				initView((Select)view, name);
				break;
			case LayerType.SLIDER:
				view = factory.createSlider();
				initView((Slider)view, name);
				break;
			case LayerType.SWITCH:
				view = factory.createSwitch();
				initView((Switch)view, name);
				break;
			case LayerType.TEXT:
				view = factory.createText();
				initView((Text)view, name);
				break;
			case LayerType.WEBVIEW:
				view = factory.createWebView();
				initView((WebView)view, name);
				break;
			default:
				if(layer.getLayersCount() > 0) {
					view = factory.createViewGroup();
					initView((ViewGroup)view, name);
				}
				else {
					return view;
				}
				break;
		}
		
		setBaseProperties(view, name, layer);
		
		if(layer.getLayersCount() == 0) {
			// create background image with the content
			view.getBackgrounds().add(createBackgroundImage((Layer) layer));
		}
		
		return view;
	}

	public BackgroundImage createBackgroundImage(Layer layer) {
		BackgroundImage image = PsdstructureFactory.eINSTANCE.createBackgroundImage();
		image.setImage(LayerName.processLayerName(layer.toString()).getName().toLowerCase());
		Vector size = PsdstructureFactory.eINSTANCE.createVector();
		size.setX(layer.getWidth());
		size.setY(layer.getHeight());
		image.setSize(size);
		Vector pos = PsdstructureFactory.eINSTANCE.createVector();
		pos.setX(layer.getX());
		pos.setY(layer.getY());
		image.setPos(pos);
		return image;
	}
	
	private void setBaseProperties(View view, LayerName name, LayersContainer layer) {
		// store id
		view.setID(name.getName());
		
		// set position
		Vector pos = findTopLeftCorner(layer);
		view.setPos(pos);
		
		// set size
		Vector bottomRight = findBottomRightCorner(layer);
		Vector size = PsdstructureFactory.eINSTANCE.createVector();
		size.setX(bottomRight.getX() - pos.getX());
		size.setY(bottomRight.getY() - pos.getY());
		view.setSize(size);
	}
	
	private void initView(ProgressSpinner view, LayerName name) {
		// no specific property yet
	}

	private void initView(AdView view, LayerName name) {
		if(name.getProperties().containsKey("unitid")){
			view.setUnitid(name.getProperties().get("unitid"));
		}
	}

	private void initView(Button view, LayerName name) {
		if(name.getProperties().containsKey("text")){
			view.setText(name.getProperties().get("text"));
		}
	}

	private void initView(Checkbox view, LayerName name) {
		if(name.getProperties().containsKey("value")){
			view.setValue(name.getProperties().get("value"));
		}
		if(name.getProperties().containsKey("checked") || name.getProperties().containsKey("selected")){
			view.setSelected(true);
		}
	}

	private void initView(DatePicker view, LayerName name) {
		if (name.getProperties().containsKey("min")) {
			try {
				view.setMin(new SimpleDateFormat("yyyy-MM-d", Locale.ENGLISH).parse(name.getProperties().get("min")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if (name.getProperties().containsKey("max")) {
			try {
				view.setMax(new SimpleDateFormat("yyyy-MM-d", Locale.ENGLISH).parse(name.getProperties().get("max")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if (name.getProperties().containsKey("default")) {
			try {
				view.setDefault(new SimpleDateFormat("yyyy-MM-d", Locale.ENGLISH).parse(name.getProperties().get("default")));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}

	private void initView(Grid view, LayerName name) {
		if(name.getProperties().containsKey("cols")){
			view.setCols(Integer.parseInt(name.getProperties().get("cols")));
		}
		if(name.getProperties().containsKey("rows")){
			view.setRows(Integer.parseInt(name.getProperties().get("rows")));
		}
	}

	private void initView(Image view, LayerName name) {
		// no specific property yet
	}

	private void initView(Map view, LayerName name) {
		if(name.getProperties().containsKey("clickable")){
			view.setClickable(true);
		}
		else {
			view.setClickable(false);
		}
		if(name.getProperties().containsKey("apikey")){
			view.setApikey(name.getProperties().get("apikey"));
		}
	}

	private void initView(ProgressBar view, LayerName name) {
		// no specific property yet
	}

	private void initView(RadioButton view, LayerName name) {
		if(name.getProperties().containsKey("value")){
			view.setValue(name.getProperties().get("value"));
		}
		if(name.getProperties().containsKey("selected")){
			view.setSelected(true);
		}
	}

	private void initView(Scroll view, LayerName name) {
		// no specific property yet
	}

	private void initView(Select view, LayerName name) {
		for (String key : name.getProperties().keySet()) {
		    if(!key.equals("default")){
		    	SelectOption option = PsdstructureFactory.eINSTANCE.createSelectOption();
		    	option.setLabel(key);
		    	option.setValue(name.getProperties().get(key));
		    	view.getOptions().add(option);
		    	if(name.getProperties().containsKey("default") && name.getProperties().get("default").equals(key)){
		    		view.setDefault(option);
		    	}
		    }
		}
	}

	private void initView(Slider view, LayerName name) {
		if(name.getProperties().containsKey("max")){
			view.setMax(Integer.parseInt(name.getProperties().get("max")));
		}
		if(name.getProperties().containsKey("default")){
			view.setDefault(Integer.parseInt(name.getProperties().get("default")));
		}
	}

	private void initView(Switch view, LayerName name) {
		if(name.getProperties().containsKey("selected")){
			view.setSelected(true);
		}
		else {
			view.setSelected(false);
		}
		
	}

	private void initView(Text view, LayerName name) {
		if(name.getProperties().containsKey("editable")){
			view.setEditable(true);
		}
		else {
			view.setEditable(false);
		}
		if(name.getProperties().containsKey("text")){
			view.setText(name.getProperties().get("text"));
		}
		if(name.getProperties().containsKey("type")){
			switch(name.getProperties().get("type")){
				case "textpassword":
					view.setType("textPassword");
				break;
				default: 
					view.setType(name.getProperties().get("type"));
					break;
			}
		}
	}

	private void initView(WebView view, LayerName name) {
		if(name.getProperties().containsKey("url")) {
			view.setUrl(name.getProperties().get("url"));
		}
	}
	
	private void initView(ViewGroup view, LayerName name) {
		
	}
	

	private Vector findTopLeftCorner(LayersContainer layer) {
		Vector pos = PsdstructureFactory.eINSTANCE.createVector();
		pos.setX(999999999);
		pos.setY(999999999);
		
		if(layer.getLayersCount() == 0) {
			pos.setX(layer.getX());
			pos.setY(layer.getY());
			return pos;
		}
		
		for (int i = 0; i < layer.getLayersCount(); i++) {
			if(layer.getLayer(i).getLayersCount()  > 0) {
				Vector tmppos = findTopLeftCorner(layer.getLayer(i));
				if(tmppos.getX() < pos.getX()){
					pos.setX(tmppos.getX());
				}
				if(tmppos.getY() < pos.getY()){
					pos.setY(tmppos.getY());
				}
			}
			else {
				if(layer.getLayer(i).getX() < pos.getX() || i == 0){
					pos.setX(layer.getLayer(i).getX());
				}
				if(layer.getLayer(i).getY() < pos.getY() || i == 0){
					pos.setY(layer.getLayer(i).getY());
				}
			}
		}
		return pos;
	}
	
	private Vector findBottomRightCorner(LayersContainer layer) {
		Vector pos = PsdstructureFactory.eINSTANCE.createVector();
		
		if(layer.getLayersCount() == 0) {
			pos.setX(layer.getRight());
			pos.setY(layer.getBottom());
			return pos;
		}
		
		for (int i = 0; i < layer.getLayersCount(); i++) {
			if(layer.getLayer(i).getLayersCount()  > 0) {
				Vector tmppos = findBottomRightCorner(layer.getLayer(i));
				if(tmppos.getX() > pos.getX()){
					pos.setX(tmppos.getX());
				}
				if(tmppos.getY() > pos.getY()){
					pos.setY(tmppos.getY());
				}
			}
			else {
				if(layer.getLayer(i).getRight() > pos.getX()){
					pos.setX(layer.getLayer(i).getRight());
				}
				if(layer.getLayer(i).getBottom() > pos.getY()){
					pos.setY(layer.getLayer(i).getBottom());
				}
			}
		}
		return pos;
	}

	public View createBaseView(LayerName name, LayersContainer layer) {
		View baseView = PsdstructureFactory.eINSTANCE.createViewGroup();
		setBaseProperties(baseView, name, layer);
		initView((ViewGroup)baseView, name);
		return null;
	}

}
