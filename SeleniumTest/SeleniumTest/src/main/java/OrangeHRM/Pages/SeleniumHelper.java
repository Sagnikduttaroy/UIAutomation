package OrangeHRM.Pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumHelper {

	WebDriver driver;
	public SeleniumHelper(WebDriver driver) {

		this.driver=driver;
	}
	public void LaunchUrl(String Url) {

		driver.get(Url);
	}

	public void TextEnter(By WebElement, String value) {

		driver.findElement(WebElement).sendKeys(value);
	}

	public void TextEnter(WebElement WebElement, String value) {

		WebElement.sendKeys(value);
	}

	public void Click(By WebElement ) {

		driver.findElement(WebElement).click();
	}
	public void Click(WebElement WebElement ) {

		WebElement.click();
	}

	public void WaitTillElementFound(WebElement elem) {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(elem));
	}
	
	
	public Boolean IsElementPresent(WebElement WebElement ) {

		return	WebElement.isDisplayed();
	}
	
	public void TakeScreenshot(WebElement elem) throws IOException {
		
		File SrcFile= elem.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("logo.png");
		FileUtils.copyFile(SrcFile, DestFile);
		
	}

}
