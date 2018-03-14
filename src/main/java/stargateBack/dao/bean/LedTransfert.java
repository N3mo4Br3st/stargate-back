package stargateBack.dao.bean;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LedTransfert{

	private int rubanId;
	
	private Collection<Integer> ledId;

	//modeAllumage 
	// 0 => rgb sur la led
	// 1 => rgb sur ruban complet
	// 2 => animation 
	
	private int modeAllumage;

	private int red;
	private int blue;
	private int green;

	//modeAnimation 
	// 0 => animation chevron 
		// param : 
		//	numChevron : [id]
		// [option] color : [red/blue/green/..]
	// 1 => animation glyphs 
	// param : 
	//	numGlyphDepart : [id]
	// [option] color : [red/blue/green/..]
	// 2 => animation rond central
	// [option] palette : [red/blue/green/..]
	
	private int modeAnimation;
	private Map<String,String> paramAnimation;
	
	public LedTransfert(int rubanId, Collection<Integer> ledId, int modeAllumage, int red, int blue, int green,
			int modeAnimation,Map<String,String> paramAnimation) {
		super();
		this.rubanId = rubanId;
		this.ledId = ledId;
		this.modeAllumage = modeAllumage;
		this.red = red;
		this.blue = blue;
		this.green = green;
		this.modeAnimation = modeAnimation;
		this.paramAnimation = paramAnimation;
	}


	public int getRubanId() {
		return rubanId;
	}
	
	public void setRubanId(int rubanId) {
		this.rubanId = rubanId;
	}
	
	public Collection<Integer> getLedId() {
		return ledId;
	}
	
	public void setLedId(Collection<Integer> ledId) {
		this.ledId = ledId;
	}
	
	public int getModeAllumage() {
		return modeAllumage;
	}
	
	public void setModeAllumage(int modeAllumage) {
		this.modeAllumage = modeAllumage;
	}
	
	public int getRed() {
		return red;
	}
	
	public void setRed(int red) {
		this.red = red;
	}
	
	public int getBlue() {
		return blue;
	}
	
	public void setBlue(int blue) {
		this.blue = blue;
	}
	
	public int getGreen() {
		return green;
	}
	
	public void setGreen(int green) {
		this.green = green;
	}
	
	public int getModeAnimation() {
		return modeAnimation;
	}
	
	public void setModeAnaimation(int modeAnimation) {
		this.modeAnimation = modeAnimation;
	}


	public Map<String,String> getParamAnimation() {
		return paramAnimation;
	}


	public void setParamAnimation(Map<String,String> paramAnimation) {
		this.paramAnimation = paramAnimation;
	}
	
	public void addToParamAnimation(String paramAnimation, String valueAnimation) {
		if(this.paramAnimation == null) {
			this.paramAnimation = new HashMap<String,String>();
		}
		this.paramAnimation.put(paramAnimation, valueAnimation);
	}
}
