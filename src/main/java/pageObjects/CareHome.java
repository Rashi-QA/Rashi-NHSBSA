package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CareHome extends Common{

public WebDriver driver;
	
	public CareHome (WebDriver driver)
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
	
	public SavingsorProperty NextButton()
	{
		next().click();
		SavingsorProperty sp = new SavingsorProperty(driver);
		return sp;
	}


}
