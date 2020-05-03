package design.patterns.Tests;

import org.testng.annotations.Test;

import implement.designpatterns.creational.*;


public class AbstractFactoryTests {

	@Test
	public void ContractTest() {
		CandidateSelectedF contract = CandidateSelectedAFactory.getCandidateSelected(new SelectedOnContractFactory("Sumeet Jain", 22.34, "contract", "Cloud computing"));
		System.out.println(contract);
	}


	@Test
	public void FulltimeTest() {
		CandidateSelectedF fulltime = CandidateSelectedAFactory.getCandidateSelected(new SelectedOnFullTimeFactory("Sunny J",11.2 ,"Fulltime", "HR"));
		System.out.println(fulltime);

	}

}
