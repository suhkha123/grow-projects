package corejava.advanced.Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import implement.corejava.advanced.EmployeeClone;
import implement.corejava.advanced.EmployeeComparable;

public class Clonelog4jTests {
	
	EmployeeClone emplist1 = new EmployeeClone("Suhail", 543212, 34);
	Logger log = Logger.getLogger(Clonelog4jTests.class);

	@Test
	void naturalSortTest() {
	try {
		log.info("Employee object is created..");
		log.info("Employee object 1 data => "+emplist1);

		EmployeeClone emplist2 = (EmployeeClone) emplist1.clone();
		
		log.info("Employee object is cloned into emplist2..");

		log.info("Employee object 2 data => "+emplist2);

		
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	



	
	}
	

}
