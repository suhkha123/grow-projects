package corejava.advanced.Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

import implement.corejava.advanced.EmployeeComparable;

public class ComparableTests {
	
	List<EmployeeComparable> emplist = new ArrayList<>();
	
	@Test
	void naturalSortTest() {
	emplist.add(new EmployeeComparable("Suhail", 543212, 34));
	emplist.add(new EmployeeComparable("Sameer", 363212, 24));
	emplist.add(new EmployeeComparable("Anusha", 443212, 54));
	emplist.add(new EmployeeComparable("Jack", 743212, 38));
	
	System.out.println("Unsorted list "+emplist);
	Collections.sort(emplist);
	System.out.println("Natural ordered Sorted list "+emplist);

	
	}
	

}
