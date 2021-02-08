package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 By start = By.xpath("//input[@value='Start']");
	private By okwithCookies = By.id("nhsuk-cookie-banner__link_accept_analytics");
	
	public WebElement AcceptCookies()
	{
		return driver.findElement(okwithCookies) ;
	}
	public CountryPage GetStarted()
	{
		driver.findElement(start).click();
		CountryPage countrypage = new CountryPage(driver);
		return countrypage;
		
	}
	

}
