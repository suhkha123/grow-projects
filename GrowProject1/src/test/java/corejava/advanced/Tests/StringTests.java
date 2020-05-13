package corejava.advanced.Tests;

import org.testng.annotations.Test;

import implement.corejava.advanced.StringCase;

public class StringTests {
		
	StringCase sc = new StringCase();
	
	@Test
	void appendTest(){
		
	//	for (int i=1;i<10;i++) {
			System.out.println(sc.appendString("Chintu", "Bantu"));
			System.out.println(sc.appendStringBuffer("Chintu"));
			System.out.println(sc.appendStringBuilder("Chintu"));

	//	}
	}
	
	@Test
	void compareTest(){
			System.out.println(sc.compareString("Chintu", "Bantu"));
			System.out.println(sc.compareString("Bantu", "Bantu"));
			System.out.println(sc.compareString("Bantu", "Chintu"));
	}
	
	@Test
	void valueTest(){
			System.out.println(sc.checkforvalue("Chintu", "Bantu"));
			System.out.println(sc.checkforvalue("Bantu", "Bantu"));
	}
	
	@Test
	void referenceTest(){
			System.out.println(sc.checkforreference("Chintu", "Bantu"));
			System.out.println(sc.checkforreference("Bantu", "Bantu"));
	}
}
