package psd;

import java.awt.Color;
import java.util.ArrayList;

/**
 * Stores information about the textual value of a layer
 * @author lovas
 *
 */
public class TextData {
	private String text = "";
	private int fontSize = 0;
	private String color = "";
	
	public TextData(){}
	
	public TextData(String text, int fontSize, String color) {
		super();
		this.text = text;
		this.fontSize = fontSize;
		this.color = color;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public String getColor() {
		return color;
	}

	/**
	 * Set color in hex
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Set color with rgb
	 * @param color
	 */
	public void setColor(ArrayList color) {
		if(color == null) {
			this.color = "FFFFFF";
			return;
		}
		Color c = new Color((int)(((Double)color.get(0))*255),(int)(((Double)color.get(1))*255), (int)(((Double)color.get(2))*255));
		this.color = Integer.toHexString( c.getRGB() & 0x00ffffff );
	}

}
