package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automationCore.Common;

public class PartnerPage extends Common{

public WebDriver driver;
	
	public PartnerPage(WebDriver driver)
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
	
	
	public TaxBenefitsPage Nextbutton()
	{
		next().click();
		TaxBenefitsPage taxes = new TaxBenefitsPage(driver);
		return taxes;
		
	}
}
	
	

