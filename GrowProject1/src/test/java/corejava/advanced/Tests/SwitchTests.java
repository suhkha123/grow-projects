package corejava.advanced.Tests;

import org.testng.annotations.Test;

import implement.corejava.advanced.*;

public class SwitchTests {

	@Test
	void findMonthTest(){
		
		SwitchCase sc = new SwitchCase();
		for(int i=0;i<=12;i++) 
			System.out.println(sc.findMonthName(i));
		
	}
	

	
}
