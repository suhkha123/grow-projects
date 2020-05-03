package implement.designpatterns.structural;

public abstract class ShapeDecorator {

	protected ShapeD decoratedShape;

	public ShapeDecorator(ShapeD decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}
	
	public void draw() {
		decoratedShape.draw();
		setRedborder(decoratedShape);
	}

	private void setRedborder(ShapeD decoratedShape) {
		System.out.println("Border color : Red");		
	}
	
}
