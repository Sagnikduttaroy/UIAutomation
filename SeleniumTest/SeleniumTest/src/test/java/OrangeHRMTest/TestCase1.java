package OrangeHRMTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import OrangeHRM.Pages.AdminPanel;
import OrangeHRM.Pages.LoginPage;
import OrangeHRM.Pages.SeleniumHelper;
import OrangeHRM.Pages.TestConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	String Url="https://opensource-demo.orangehrmlive.com";
	String UserName="Admin";
	String UserPassword="admin123";
	WebDriver driver;


	LoginPage _LoginPage;
	AdminPanel _AdminPanel;

	@BeforeTest
	public void BeforeTest() {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();		
		System.out.println("Test starts successfully");
		_LoginPage = new LoginPage(driver);
		_AdminPanel = new AdminPanel(driver);
	}


	//@AfterTest
	public void AfterTest() {

		System.out.println("Test end successfully");
		driver.quit();
	}

	@Test
	public void TC_01() {
		_LoginPage.OpenUrl(Url);
		_LoginPage.Login(UserName, UserPassword);
		_AdminPanel.VerifyDashboardPage();
		_AdminPanel.ClickOnMenu("Admin");
		_AdminPanel.ClickOnAddButtnAndAddUser("Admin", "Enabled", "Ravi M B", "Saggy", "Ilove10$");

	}

}
