package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import automationCore.Common;

public class DiabetesPage extends Common{

public WebDriver driver;
	
	public DiabetesPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void NoDiabetes()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", decline());
	}
	
	public void Diabetic()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", accept());
	}
	
	public GlaucomaPage NextButton()
	{
		next().click();
		GlaucomaPage glaucomapage = new GlaucomaPage(driver);
		return glaucomapage;
	}
}