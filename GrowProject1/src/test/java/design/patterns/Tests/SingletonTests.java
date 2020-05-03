package design.patterns.Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import implement.designpatterns.creational.*;


public class SingletonTests {
	@BeforeTest
	public void setUp() {
		WebDriverInstanceSingleton.initialize();
	}

	@Test
	public void verifyEpamTitle() {
		String title = WebDriverInstanceSingleton.driver.getTitle();
		assertEquals(title, "EPAM | Enterprise Software Development, Design & Consulting");
	}

	@AfterTest
	public void tearDown() {
		WebDriverInstanceSingleton.quit();
	}

}
