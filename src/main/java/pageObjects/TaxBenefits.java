package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TaxBenefits extends Common{

	public TaxBenefits(WebDriver driver)
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
	
	public PregnantorGivenBirth Nextbutton()
	{
		next().click();
		PregnantorGivenBirth PB= new PregnantorGivenBirth(driver);
		return PB;
	}
}
