package oopsConcepts.Advance.Tests;

import org.testng.annotations.Test;

import inplement.inheritance.andpolymophism.MethodOveriding;
import inplement.inheritance.andpolymophism.MethodOverloading;

public class PolymorphismTests {

	MethodOverloading morld = new MethodOverloading();
	MethodOveriding mord = new MethodOveriding();
			
	@Test
	void MethodOverloadingTest(){
		
		System.out.println("The addition of numbers 1,3 is "+morld.addnum(1, 3));
		System.out.println("The addition of numbers 1.2,3.45 is "+morld.addnum(1.2, 3.45));
		System.out.println("The addition of numbers 13,32,34 is "+morld.addnum(13, 32, 34));
		System.out.println("The addition of numbers 13.33,34.55, 55.46 is "+morld.addnum(13.33, 34.55, 55.46));

	}
	
	@Test
	void methodoverridingTest(){
		
		System.out.println(mord.addnum(1, 3));	
		System.out.println(mord.addnum(1,2,45));
	}
	
}
