package inplement.inheritance.andpolymophism;

public class ColoredPoint extends Point {
	
	public String colorName;
	
	public ColoredPoint(int x, int y, String colorName) {
		super(x, y);
		this.colorName = colorName;
	}
	
	public String getColorName() {
		return colorName;
	}
	
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

}
