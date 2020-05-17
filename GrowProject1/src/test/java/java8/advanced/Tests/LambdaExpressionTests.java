package java8.advanced.Tests;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import implement.java8.advanced.Employee;
public class LambdaExpressionTests {
	
	Logger log = Logger.getLogger(LambdaExpressionTests.class);

	@Test
	void sortingwithComparatorTest(){
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee("Suhail", "Fulltime", 34));
		al.add(new Employee("Sameer", "Contract", 24));
		al.add(new Employee("Anusha", "Intern", 54));
		al.add(new Employee("Jack", "Fulltime", 38));
		
		log.info("Employee in unsorted order => "+al);
		
		Collections.sort(al, (al1,al2)->{   if (al1.getAge() > al2.getAge())
												return 1;
											if (al1.getAge() < al2.getAge())
												return -1;
											return 0;
										});
		
		log.info("Employee in order of their age => "+al);
		
		Collections.sort(al, (al1,al2)-> al1.getEmpName().compareTo(al2.getEmpName()));
		
		log.info("Employee in order of their name => "+al);

		
		
	}

}
