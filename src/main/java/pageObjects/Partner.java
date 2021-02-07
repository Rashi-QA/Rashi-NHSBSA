package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Partner extends Common{

public WebDriver driver;
	
	public Partner(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void Nopartnersupport()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", decline());
	}
	
	public void withPartner()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", accept());
	}
	
	
	public TaxBenefits Nextbutton()
	{
		next().click();
		TaxBenefits taxes = new TaxBenefits(driver);
		return taxes;
		
	}
}
	
	

