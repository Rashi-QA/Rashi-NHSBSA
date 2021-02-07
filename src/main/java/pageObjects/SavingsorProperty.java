package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SavingsorProperty extends Common{

public WebDriver driver;
	
	public SavingsorProperty(WebDriver driver)
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
		OutcomePage  Op = new OutcomePage(driver);
		return Op;
		
	}
	
}
