package design.patterns.Tests;

import org.testng.annotations.Test;

import implement.designpatterns.behavioral.AdditionS;
import implement.designpatterns.behavioral.MultiplicationS;
import implement.designpatterns.behavioral.Strategy;
import implement.designpatterns.behavioral.SubstractionS;
import implement.designpatterns.structural.*;;

public class StrategyTests {
	
	Strategy calculate;
	
	@Test
	public void additionTest() {
		calculate = new AdditionS(19.2f, 34.2f); 
		System.out.println(calculate.calculation());
	}

	@Test
	public void substractionTest() {
		calculate = new SubstractionS(91.23f, 34.2f); 
		System.out.println(calculate.calculation());
	}

	
	@Test
	public void multiplicationTest() {
		calculate = new MultiplicationS(19.2f, 34.2f); 
		System.out.println(calculate.calculation());
	}

}
