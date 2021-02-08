package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import automationCore.Common;

public class TaxBenefitsPage extends Common{

	public TaxBenefitsPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void noTaxBenefits()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", decline());
	}
	
	public void taxCredits()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", accept());
	}
	
	public PregnantorGivenBirthPage Nextbutton()
	{
		next().click();
		PregnantorGivenBirthPage pregnantorgivenbirth= new PregnantorGivenBirthPage(driver);
		return pregnantorgivenbirth;
	}
}
