package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeTest
	void setUp(){
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void navigateTest() throws InterruptedException {
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void loginPageTitleTest() {
	String title=loginPage.validateLoginPageTitle();
	Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=3)
	public void crmLogoImageTest() {
	boolean flag=loginPage.validateCRMImage();
	Assert.assertTrue(flag);
	}

	@Test(priority=4)
	public void loginTest() {
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterTest
	void tearDown(){
		driver.quit();
	}
	
}
