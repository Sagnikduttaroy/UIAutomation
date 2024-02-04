package OrangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import net.bytebuddy.implementation.bind.annotation.Super;

public class AdminPanel extends SeleniumHelper{


	WebDriver driver;



	//Objects
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']")
	WebElement btnAdmin;	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement txtAdmin;	
	@FindBy(xpath="//button[contains(.,'Add')]")
	WebElement btnAdd;
	@FindBy(xpath="//label[contains(.,'User Role')]/following::div/div/div/div")
	WebElement drpUserRole;
	@FindBy(xpath="//label[contains(.,'Status')]/following::div/div/div/div")
	WebElement drpStatus;
	@FindBy(xpath="//label[contains(.,'Employee Name')]/following::input")
	WebElement txtEmployeeName;
	@FindBy(xpath="//label[contains(.,'Username')]/following::input")
	WebElement txtUserName;
	@FindBy(xpath="//label[contains(.,'Password')]/following::input")
	WebElement txtPassword;
	@FindBy(xpath="//label[contains(.,'Confirm Password')]/following::input")
	WebElement txtConfirmPassword;
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnSave;
	@FindBy(xpath="//div[@class='oxd-autocomplete-option']")
	WebElement txtMatch;
	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']")
	WebElement txtDashboard;
	By txtDrpValues(String values) {

		return By.xpath("//div[@role='option']/span[contains(.,'"+values+"')]");
	}
	By btnMenu(String Menu) {

		return By.xpath("//span[text()='"+Menu+"']");
	}	
	
	
	@FindBy(xpath="//img[@alt='client brand banner']")
	WebElement txtOrangeHRM;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	WebElement tbSearch;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Leave']")
	WebElement btnLeave;




	// End of Objects




	public AdminPanel(WebDriver driver) {

		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void ClickOnMenu(String Menu) {


		Click(btnMenu(Menu));


	}

	public Boolean VerifyDashboardPage() {

		WaitTillElementFound(txtDashboard);
		return IsElementPresent(txtDashboard);
	}

	public void ClickOnAddButtnAndAddUser(String UserRole, String Status,String EmployeeName, String UserName, String PassWord) {


		WaitTillElementFound(txtAdmin);
		Click(btnAdd);
		WaitTillElementFound(txtAdmin);
		WaitTillElementFound(drpUserRole);
		Click(drpUserRole);		
		Click(txtDrpValues(UserRole));
		Click(drpStatus);
		Click(txtDrpValues(Status));
		TextEnter(txtEmployeeName, EmployeeName);
		WaitTillElementFound(txtMatch);
		Click(txtMatch);
		TextEnter(txtUserName, UserName);
		TextEnter(txtPassword, PassWord);
		TextEnter(txtConfirmPassword, PassWord);

		Click(btnSave);



	}

	public void ClickOnSearchButtonAndPassData() throws InterruptedException {
		WaitTillElementFound(txtOrangeHRM);
		WebElement elem=driver.findElement(RelativeLocator.with(By.tagName("span")).below(btnAdmin).above(btnLeave));

		System.out.println( "Class of element is: "+elem.getAttribute("class"));
		//elem.sendKeys("Admin");

		Thread.sleep(6000);

		driver.quit();




	}

}



