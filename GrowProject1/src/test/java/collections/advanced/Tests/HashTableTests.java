package collections.advanced.Tests;

import java.util.*;
import java.util.Map.Entry;

import javax.lang.model.element.Element;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import implement.collections.advanced.EmployeeAL;

public class HashTableTests {
	
	Hashtable empcmpny = new Hashtable();
	Logger log = Logger.getLogger(HashTableTests.class);
	
	@Test
	void hashMapTableTest1() {
		empcmpny.put("epam",new EmployeeAL("Suhail", 543212, 34));
		empcmpny.put("epam",new EmployeeAL("Sameer", 363212, 24));
		empcmpny.put("wipro",new EmployeeAL("Anusha", 443212, 54));
		empcmpny.put("microsoft",new EmployeeAL("Jack", 743212, 38));
	
		Set emp =  empcmpny.entrySet();
			log.info(emp);
		
	}
	
	@Test
	void hashMapTableTest2() {
		
		empcmpny.put("hcl",new EmployeeAL( "Sal", 543212, 34));
		empcmpny.put("jcp",new EmployeeAL( "Salo", 23212, 34));

		Hashtable ec2 = (Hashtable) empcmpny.clone();
		Enumeration emp =  ec2.elements();
			log.info(ec2);
		
			empcmpny.clear();
			log.info(ec2.hashCode());

	}
	
}
	
