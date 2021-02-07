package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Partner {

public WebDriver driver;
	
	public Partner(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Nopartner = By.id("radio-no");
	By Nextbutton = By.id("next-button");
	
	public WebElement Nopartnersupport()
	{
	return driver.findElement(Nopartner);
	}
	
	public WebElement Nextbutton()
	{
		return driver.findElement(Nextbutton);
	}
}
	
	

