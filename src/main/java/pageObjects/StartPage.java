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
	
	private By start = By.xpath("//input[@value='Start']");
	private By okwithCookies = By.id("nhsuk-cookie-banner__link_accept_analytics");
	
	public WebElement AcceptCookies()
	{
		return driver.findElement(okwithCookies) ;
	}
	public WhereYouLive GetStarted()
	{
		driver.findElement(start).click();
		WhereYouLive country = new WhereYouLive(driver);
		return country;
		
	}
	

}
