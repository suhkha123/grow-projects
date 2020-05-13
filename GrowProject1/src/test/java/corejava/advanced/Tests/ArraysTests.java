package corejava.advanced.Tests;

import org.testng.annotations.Test;

import implement.corejava.advanced.*;

public class ArraysTests {

	ArraysSearchSort arr = new ArraysSearchSort();
	
	@Test
	void searchEvenTest(){
		
		arr.searchEvenNum(new int[] {10,23,54,65,2,4,1});
	}
	
	@Test
	void sortTest(){
		
		arr.sortArray(new int[] {10,23,54,65,2,4,1});
	}
}
