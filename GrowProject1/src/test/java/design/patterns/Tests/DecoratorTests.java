package design.patterns.Tests;

import org.testng.annotations.Test;

import implement.designpatterns.structural.*;;

public class DecoratorTests {
	

	@Test
	public void circleTest() {
		ShapeD circle = new CircleD(); 
		circle.draw();
	}

	@Test
	public void rectangleTest() {
		ShapeD square = new SquareSD(); 
		square.draw();
	}

	
	@Test
	public void redcircleTest() {
		RedShapeDecorator redcircle = new RedShapeDecorator(new CircleD()); 
		redcircle.draw();
	}
	
	@Test
	public void redsquareTest() {
		RedShapeDecorator redsquare = new RedShapeDecorator(new SquareSD()); 
		redsquare.draw();
	}
}
