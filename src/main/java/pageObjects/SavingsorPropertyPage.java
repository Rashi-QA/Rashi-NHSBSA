package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import automationCore.Common;

public class SavingsorPropertyPage extends Common{

public WebDriver driver;
	
	public SavingsorPropertyPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void NoElegible()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", decline());
	}
	
	public void Elegible()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", accept());
	}
	public OutcomePage Nextbutton()
	{
		next().click();
		OutcomePage  outcome = new OutcomePage(driver);
		return outcome;
		
	}
	
}
