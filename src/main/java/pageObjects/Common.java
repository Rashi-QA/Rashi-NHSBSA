package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	
    public WebDriver driver;
	
	private By yesButton = By.id("radio-yes");
	private By noButton = By.id("radio-no");
	private By Nextbutton = By.id("next-button");
	
	public Common (WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement accept()
	{
		return driver.findElement(yesButton);
	}
	
	public WebElement decline()
	{
		return driver.findElement(noButton);
			
	}
	
	public WebElement next()
	{
		return driver.findElement(Nextbutton);
	}
	
	public void waitForVisibility(WebElement element) throws Error{
        new WebDriverWait(driver, 5)
             .until(ExpectedConditions.visibilityOf(element));
}
}