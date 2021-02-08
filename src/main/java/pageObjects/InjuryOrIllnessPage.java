package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import automationCore.Common;

public class InjuryOrIllnessPage extends Common {

public WebDriver driver;
	
	public InjuryOrIllnessPage(WebDriver driver)
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
	
	public DiabetesPage Next()
	{
		next().click();
		DiabetesPage diabetespage= new DiabetesPage(driver);
		return diabetespage;
	}
	
}
