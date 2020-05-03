package design.patterns.Tests;

import org.testng.annotations.Test;

import implement.designpatterns.creational.CandidateBuilder;
import implement.designpatterns.creational.CandidateShortlistedB;

public class BuilderTests {

	@Test
	void JavaCandidateTest(){
		
		CandidateShortlistedB candidate = new CandidateBuilder().setCandidateName("Sam Khan").setAge(33).setMainSkill("Java").build();
		
		System.out.println(candidate);
		
	}
	
	@Test
	void DotNetCandidateTest(){
		
		CandidateShortlistedB candidate = new CandidateBuilder().setCandidateName("Jose Varghese").setAge(38).setMainSkill(".Net").setReadyToRelocate(true).setExpectedSalary(18.55).build();
		
		System.out.println(candidate);
		
	}
	
	@Test
	void CandidateTest(){
		
		CandidateShortlistedB candidate = new CandidateBuilder().setMainSkill("Clouds").build();
		
		System.out.println(candidate);
		
	}
	
	

	
}
