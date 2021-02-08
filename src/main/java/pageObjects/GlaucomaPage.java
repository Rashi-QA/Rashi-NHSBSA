package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import automationCore.Common;

public class GlaucomaPage extends Common{

public WebDriver driver;
	
	public GlaucomaPage (WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void NoGlaucoma()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", decline());
	}
	
	public void Glaucomic()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", accept());
	}
	
	public CareHomePage NextButton()
	{
		next().click();
		CareHomePage carehomepage = new CareHomePage(driver);
		return carehomepage;
	}

	
}
