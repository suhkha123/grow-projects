package collections.advanced.Tests;

import java.util.*;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import implement.collections.advanced.EmployeeAL;

public class HashMapTests {
	
	HashMap<String,EmployeeAL> empcmpny = new HashMap<String,EmployeeAL>();
	Logger log = Logger.getLogger(HashMapTests.class);
	
	@Test
	void hashMapTest() {
		empcmpny.put("epam",new EmployeeAL("Suhail", 543212, 34));
		empcmpny.put("epam",new EmployeeAL("Sameer", 363212, 24));
		empcmpny.put("wipro",new EmployeeAL("Anusha", 443212, 54));
		empcmpny.put("microsoft",new EmployeeAL("Jack", 743212, 38));
	
		for (Entry<String,EmployeeAL> emp : empcmpny.entrySet())
			log.info(emp.getKey()+"->"+emp.getValue());
		
		empcmpny.put("hcl",new EmployeeAL( "Sal", 543212, 34));
		log.info("hcl employee value ->"+empcmpny.get("hcl"));

		
	}
	
}
	
