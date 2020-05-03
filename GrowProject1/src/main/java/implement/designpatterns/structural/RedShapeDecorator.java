package implement.designpatterns.structural;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(ShapeD decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		super.draw();
		setRedBorder(decoratedShape);
	}
	
	public void setRedBorder(ShapeD decoratedShape) {
		System.out.println("Border color - red.");
	}

}
