package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Glaucoma extends Common{

public WebDriver driver;
	
	public Glaucoma (WebDriver driver)
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
	
	public CareHome NextButton()
	{
		next().click();
		CareHome peramentincarehome = new CareHome(driver);
		return peramentincarehome;
	}

	
}
