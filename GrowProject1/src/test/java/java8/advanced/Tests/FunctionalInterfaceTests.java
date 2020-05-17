package java8.advanced.Tests;

import java.util.ArrayList;
import java.util.function.*;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import implement.java8.advanced.Employee;;

public class FunctionalInterfaceTests {
	Logger log = Logger.getLogger(FunctionalInterfaceTests.class);

	ArrayList<Employee> al = new ArrayList<Employee>();

	@Test
	void predicateTest(){
		al.add(new Employee("Suhail", "Fulltime", 34));
		al.add(new Employee("Sameer", "Contract", 24));
		log.info("-------------Predicate Test----------------------");
		log.info("Check employee age eligibility for hike and Promotion.");
		
		Predicate<Integer> eligibility=age->(age>21); 
		BiPredicate<Integer, String> eligibilityforPromotion = (age,empType)-> (age>21 && empType.equalsIgnoreCase("fulltime"));
																
		for (Employee emp : al) {
			log.info("Employee-"+emp.getEmpName()+" eligibility for hike is "+eligibility.test(emp.getAge()));
			log.info("And eligibility for Promotion is "+eligibilityforPromotion.test(emp.getAge(),emp.getempType()));
			}
		}

	
	@Test
	void functionTest(){
		al.add(new Employee("Suhail", "Fulltime", 34));
		al.add(new Employee("Sameer", "Contract", 24));

		log.info("-------------Function Test----------------------");
		
		Function<String,String> empNameUC =empName-> empName.toUpperCase();
		BiFunction<String, String,String> emptp = (empName,empType)-> (empName+"-"+empType);
																
		for (Employee emp : al) {
			log.info("Employee-"+emp.getEmpName()+" in UpperCase is "+empNameUC.apply(emp.getEmpName()));
			log.info("Employee and employment type is "+emptp.apply(emp.getEmpName(),emp.getempType()));
			}
		}
	
	
	@Test
	void consumerTest(){
		al.add(new Employee("Suhail", "Fulltime", 34));
		al.add(new Employee("Sameer", "Contract", 24));
		al.add(new Employee("Anusha", "Intern", 54));
		al.add(new Employee("Jack", "Fulltime", 38));

		log.info("-------------Consumer Test----------------------");
		
		Consumer<String> empNameUC =empName-> log.info(empName.toUpperCase()+" is hired.");
		BiConsumer<String, String> emptp = (empName,empType)-> log.info(empName.toUpperCase()+" is hired as "+empType);
																
		for (Employee emp : al) {
			log.info("Employee-"+emp.getEmpName()+" details =>");
			empNameUC.accept(emp.getEmpName());
			emptp.accept(emp.getEmpName(),emp.getempType());
			}
		}
	
	@Test
	void supplierTest(){
		al.add(new Employee("Suhail", "Fulltime", 34));
		al.add(new Employee("Sameer", "Contract", 24));
		al.add(new Employee("Anusha", "Intern", 54));
		al.add(new Employee("Jack", "Fulltime", 38));

		log.info("-------------Supplier Test----------------------");
		
		Supplier<Integer> findEmp =()-> al.size();																
		log.info("Total Employees are "+findEmp.get()+".");

			}
		
}
