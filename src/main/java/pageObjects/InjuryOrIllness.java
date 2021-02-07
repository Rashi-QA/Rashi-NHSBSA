package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InjuryOrIllness extends Common {

public WebDriver driver;
	
	public InjuryOrIllness(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void NoInjury()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", decline());
	}
	
	public void Unwell()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", accept());
	}
	
	public Diabetes Next()
	{
		next().click();
		Diabetes Db= new Diabetes(driver);
		return Db;
	}
	
}
