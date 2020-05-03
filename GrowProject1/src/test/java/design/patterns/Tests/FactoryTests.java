package design.patterns.Tests;

import org.testng.annotations.Test;

import implement.designpatterns.creational.*;


public class FactoryTests {

	@Test
	public void ContractTest() {
		CandidateSelectedF contract = SelectedFactory.getCandidate("Tera P", "Contract", 22.75, "DB testing");
		System.out.println(contract);
	}


	@Test
	public void FulltimeTest() {
		CandidateSelectedF fulltime = SelectedFactory.getCandidate("Sunny J", "Fulltime", 12.00, "HR");
		System.out.println(fulltime);

	}

}
