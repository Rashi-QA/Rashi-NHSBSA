package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage {
	
	public WebDriver driver;
	
	public StartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By start = By.xpath("//input[@value='Start']");
	By okwithCookies = By.id("nhsuk-cookie-banner__link_accept_analytics");
	
	public WebElement AcceptCookies()
	{
		return driver.findElement(okwithCookies);
	}
	public WebElement GetStarted()
	{
		return driver.findElement(start);
	}
	

}
