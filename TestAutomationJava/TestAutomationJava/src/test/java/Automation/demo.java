package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo {
	
	WebDriver driver;
	@BeforeTest
	public void beforeRun() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagnik\\Downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void testcase() {
		
		driver.get("www.google.com");
	}

}
