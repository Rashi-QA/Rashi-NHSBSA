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
	
	By ButtonWales = By.xpath("//label[@id='label-wales']/input");
	By NextButton = By.id("next-button");
	
	public WebElement SelectWales()
	{
		return driver.findElement(ButtonWales);
	}
	
	public WebElement Next()
	{
		return driver.findElement(NextButton);
	}
}
