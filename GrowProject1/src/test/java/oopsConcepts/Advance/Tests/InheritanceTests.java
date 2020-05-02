package oopsConcepts.Advance.Tests;

import org.testng.annotations.Test;

import inplement.inheritance.andpolymophism.*;

public class InheritanceTests {

	ColoredPoint cp = new ColoredPoint(2, 4, "red");

	@Test
	void colorpointTest(){
		
		System.out.println("The color of point is "+cp.getColorName()+" with x coordinate = "+cp.getX()+" and y coordinate = "+cp.getY()+".\n");
		
	}
	
}
