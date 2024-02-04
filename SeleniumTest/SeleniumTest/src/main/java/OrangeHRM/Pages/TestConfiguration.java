package OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestConfiguration {

	WebDriver driver;
	
	
	

	/*
	 * public TestConfiguration(WebDriver Driver) {
	 * 
	 * this.driver= Driver; }
	 */
	public void BeforeTest() {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Test starts successfully");
	}

	public void AfterTest() {
		System.out.println("Test end successfully");
		driver.quit();
	}


}
