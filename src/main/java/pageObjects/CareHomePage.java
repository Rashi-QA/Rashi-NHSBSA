package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import automationCore.Common;

public class CareHomePage extends Common{

public WebDriver driver;
	
	public CareHomePage (WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void notInCareHome()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", decline());
	}
	
	public void inCareHome()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", accept());
	}
	
	public SavingsorPropertyPage NextButton()
	{
		next().click();
		SavingsorPropertyPage savingpage = new SavingsorPropertyPage(driver);
		return savingpage;
	}


}
