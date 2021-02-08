package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import automationCore.Common;

public class PregnantorGivenBirthPage extends Common{
	
	public WebDriver driver;
	
	public PregnantorGivenBirthPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
	}
	
	public void notPregnantorgivenBirth()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", decline());
	}
	
	public void pregnantorGivenBirth()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", accept());
	}
	
	
	public InjuryOrIllnessPage Nextbutton()
	{
		next().click();
		InjuryOrIllnessPage injurypage = new InjuryOrIllnessPage(driver);
		return injurypage;
		
	}
	
	
}
