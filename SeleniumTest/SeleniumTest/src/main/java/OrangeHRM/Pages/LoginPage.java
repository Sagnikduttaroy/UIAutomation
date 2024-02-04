package OrangeHRM.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.implementation.bind.annotation.Super;

public class LoginPage extends SeleniumHelper{
	
	
	WebDriver driver;
	
	SeleniumHelper _SeleniumHelper = new SeleniumHelper(driver);


	
	//Objects
	@FindBy(name="username")
	WebElement tbUserName;
	
	@FindBy(name="password")
	WebElement tbUserPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement imgLogo;


	// End of Objects




	public LoginPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		
	}

	public void OpenUrl(String Url) {

		LaunchUrl(Url);		
		System.out.println("Url Launched successfully");

	}

	public void Login(String UserName, String Password) {

		
		WaitTillElementFound(tbUserName);
		TextEnter(tbUserName, UserName);
		TextEnter(tbUserPassword, Password);		
		Click(btnLogin);
		
	

	}
	
	public void getScreenshot() throws IOException {
		
		
		_SeleniumHelper.TakeScreenshot(imgLogo);
		System.out.println("Image Saved successfully");
		
	}
	
	public void getLocationOfLogo() throws IOException {
		
		WaitTillElementFound(imgLogo);
		
		System.out.println("Height:"+imgLogo.getRect().getHeight());
		System.out.println("Width:"+imgLogo.getRect().getWidth());
		System.out.println("X Coordinate:"+imgLogo.getRect().getX());
		System.out.println("Y Coordinate:"+imgLogo.getRect().getY());
		
	}


}
