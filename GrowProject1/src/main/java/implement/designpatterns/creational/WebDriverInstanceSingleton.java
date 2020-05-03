package implement.designpatterns.creational;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInstanceSingleton {
	
	public static WebDriver driver = null;
	public static String browserName = "chrome";
	
	public static void initialize() {
	
		if (driver == null) {
			if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/Suhail_Shehzad/Downloads/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			}
		}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.get("https://www.epam.com/");
	}
	
	public static void quit() {
		driver.quit();
		driver = null;
	}
	
	public static void close() {
		driver.close();
		driver = null;
	}
}
