package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automationCore.Common;

public class CountryPage extends Common {

	public WebDriver driver;
	
	public CountryPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	private By ButtonWales = By.xpath("//label[@id='label-wales']/input");

	
	public WebElement SelectWales()
	{
		return driver.findElement(ButtonWales);
	}
	
	public DOBPage Next()
	{
		next().click();
		DOBPage dobpage = new DOBPage(driver);
		return dobpage;
		
		
	}
}
