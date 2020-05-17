package java8.advanced.Tests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import implement.java8.advanced.Employee;

public class StreamAPITests {

	Logger log = Logger.getLogger(StreamAPITests.class);

	ArrayList<Employee> al = new ArrayList<Employee>();

	
	
	@Test
	void streamTest(){
		al.add(new Employee("Suhail", "Fulltime", 34));
		al.add(new Employee("Sameer", "Contract", 24));
		al.add(new Employee("Anusha", "Intern", 54));
		al.add(new Employee("Jack", "Fulltime", 38));

		log.info("-------------Stream Test----------------------");
		
		List<Employee> al2 = al.stream().filter(a->a.getEmpName().startsWith("S")).collect(Collectors.toList());
		log.info("Employee details where name starts with S =>"+al2);
		
		al.stream().filter(a->a.getempType().equalsIgnoreCase("Contract")||a.getempType().equalsIgnoreCase("Intern")).forEach(a->System.out.println("Non full time employee =>"+a.getEmpName()));

	}
}
