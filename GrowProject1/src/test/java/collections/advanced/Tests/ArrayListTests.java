package collections.advanced.Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import corejava.advanced.Tests.Clonelog4jTests;
import implement.collections.advanced.EmployeeAL;
import implement.corejava.advanced.EmployeeComparable;

public class ArrayListTests {
	
	List<EmployeeAL> emplist = new ArrayList<EmployeeAL>();
	Logger log = Logger.getLogger(ArrayListTests.class);
	
	@Test
	void arrayListTest() {
	emplist.add(new EmployeeAL("Suhail", 543212, 34));
	emplist.add(new EmployeeAL("Sameer", 363212, 24));
	emplist.add(new EmployeeAL("Anusha", 443212, 54));
	emplist.add(new EmployeeAL("Jack", 743212, 38));
	
	Iterator<EmployeeAL> it = emplist.iterator();
	int i = 1;
	while(it.hasNext()) {
		log.info("Employee#"+i+" details :"+it.next());
		i++;
	}
   }
	
  }
	
