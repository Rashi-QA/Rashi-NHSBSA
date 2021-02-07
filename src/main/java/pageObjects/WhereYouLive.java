package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhereYouLive {

	public WebDriver driver;
	
	public WhereYouLive(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By ButtonWales = By.xpath("//label[@id='label-wales']/input");
	private By NextButton = By.id("next-button");
	
	public WebElement SelectWales()
	{
		return driver.findElement(ButtonWales);
	}
	
	public DOB Next()
	{
		driver.findElement(NextButton).click();
		DOB db = new DOB(driver);
		return db;
		
		
	}
}
