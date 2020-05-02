package oopsConcepts.Advance.Tests;

import org.testng.annotations.Test;

import implement.abstraction.andEncapsulation.*;

public class EncapsulationTests{
	
	ASCIIvalue asv = new ASCIIvalue();

	@Test
	void ASCIIvalueTest(){
		
		asv.setC('a');
		asv.setAsciival('a');
		System.out.println("The character is "+asv.getC()+" and its ascii value is "+asv.getAsciival());
		
		asv.setC('A');
		asv.setAsciival('A');
		System.out.println("The character is "+asv.getC()+" and its ascii value is "+asv.getAsciival());
		
	}
	
}