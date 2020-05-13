package corejava.advanced.Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.testng.annotations.Test;

import implement.corejava.advanced.EmployeeComparable;
import implement.corejava.advanced.EmployeeComparator;

public class ComparatorTests {
	
	List<EmployeeComparator> emplist = new ArrayList<>();
	
	@Test
	void naturalSortTest() {
	emplist.add(new EmployeeComparator("Suhail", 543212, 34));
	emplist.add(new EmployeeComparator("Sameer", 363212, 24));
	emplist.add(new EmployeeComparator("Anusha", 443212, 54));
	emplist.add(new EmployeeComparator("Jack", 743212, 38));
	
	System.out.println("Unsorted list "+emplist);
	Collections.sort(emplist, new EmployeeComparator("uhail", 43212, 34));
	System.out.println("Customized ordered Sorted list "+emplist);

	
	}
	

}
