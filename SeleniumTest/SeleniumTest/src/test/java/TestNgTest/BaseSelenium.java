package TestNgTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class BaseSelenium {
	
	WebDriver driver;
	TestData data = new TestData();
	
	@BeforeTest
	public void BeforeTest() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*"); 
		driver= new ChromeDriver(chromeOptions);
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void AfterTest() {
		
		driver.quit();
	}
	
	@Test
	public void Login() {
		
		System.out.println("https://www.google.com");
		//driver.get(value);
		System.out.println("Website title is: " +driver.getTitle());
		
		
	}
	@Test
	public void EndToEndFlow() {
		
		driver.get("https://www.luxaleaf.com/development");
		driver.findElement(data.btnOurproducts).click();
		
	}
	
	}

