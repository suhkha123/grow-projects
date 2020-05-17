package java8.advanced.Tests;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import implement.java8.advanced.CurrentMonthPayroll;
import implement.java8.advanced.Employee;

public class InterfaceDefaultStaticTests {

	ArrayList<Employee> al = new ArrayList<Employee>();
	Logger log = Logger.getLogger(InterfaceDefaultStaticTests.class);
	int noOfdays = 30;
	double rate = 32.50;
	
	@Test
	void sortingwithComparatorTest(){
		
		
		al.add(new Employee("Suhail", "Fulltime", 34));
		al.add(new Employee("Sameer", "Contract", 24));
		al.add(new Employee("Anusha", "Intern", 54));
		al.add(new Employee("Jack", "Fulltime", 38));
		
		log.info("Payroll is calculated for "+CurrentMonthPayroll.payrollMonth());
		
		for(Employee emp: al) {
		
			CurrentMonthPayroll payroll = (noOfdays,rate) -> noOfdays*rate;
		
			if(payroll.payrollEligibility(emp.getempType()))
				log.info(" The Payroll for eligible Employee-"+emp.getEmpName()+" is $" +payroll.payrollCalculation(noOfdays, rate));
		
		}
	
	}



}
