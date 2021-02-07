package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PregnantorGivenBirth extends Common{
	
	public WebDriver driver;
	
	public PregnantorGivenBirth(WebDriver driver)
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
	
	
	public InjuryOrIllness Nextbutton()
	{
		next().click();
		InjuryOrIllness Il = new InjuryOrIllness(driver);
		return Il;
		
	}
	
	
}
