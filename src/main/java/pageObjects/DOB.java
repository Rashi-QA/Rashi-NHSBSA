package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DOB {

public WebDriver driver;
	
	public DOB(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By day = By.name("dateOfBirth.day");
	By month = By.id("dob-month");
	By year = By.id("dob-year");
	By next = By.id("next-button");
	
	public WebElement day()
	{
		return driver.findElement(day);
	}
	
	public WebElement month()
	{
		return driver.findElement(month);
	}
	
	public WebElement year()
	{
		return driver.findElement(year);
	}
	
	public WebElement nextbutton()
	{
		return driver.findElement(next);
	}
	
}

	
