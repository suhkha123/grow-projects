package oopsConcepts.Advance.Tests;

import org.testng.annotations.Test;

import implement.abstraction.andEncapsulation.*;

public class AbstractionTests{
	
	@Test
	void ContractorTest(){
		
		Contractor contractor = new Contractor(7, "Surendar", 20);
		
		System.out.println("Contract Employee name is "+contractor.getEmployeeName()+" and his hourly rate is "+contractor.getPerHourCharges()+" $. This make his daily wages "+contractor.employeeSalary()+"$.\n");
		
	}
	
	@Test
	void EmployeeTest(){
		
		FullTimeEmployee employee = new FullTimeEmployee("Jitender", 30);
		
		System.out.println("Full time Employee name is "+employee.getEmployeeName()+" and his hourly rate is "+employee.getPerHourCharges()+" $. This make his daily wages "+employee.employeeSalary()+"$.\n");
		
	}
	
}