package corejava.advanced.Tests;

import org.testng.annotations.Test;

import implement.corejava.advanced.*;

public class LoopsTests {

	Loops lp = new Loops();
	@Test
	void printNameTest(){
		
		String[] names= {"Tao","Joe","Mira","Sameer","Jacob","Yusuf"};
		lp.printName(names);
	}
	
	@Test
	void evenOddNumTest(){
		
		for (int i=1;i<10;i++)
			if(lp.testNum(i))
				System.out.println(i+" is even number.");
			else 
				System.out.println(i+" is odd number.");
	}

	@Test
	void printNumTest(){
		
		for (int i=0;i<2;i++)
			lp.printNum(i);
			
	}



}
