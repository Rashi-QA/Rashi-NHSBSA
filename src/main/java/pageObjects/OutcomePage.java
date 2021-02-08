package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OutcomePage {

public WebDriver driver;
	
	public OutcomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//By outcome = By.xpath("//span[contains(text(),'Based on what')]/following-sibling::text()");
	By outcome = By.cssSelector("#result-heading");
	
	public  WebElement result()
	{
		return driver.findElement(outcome);
	}
	 
	
    
	
	
}
