package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Diabetes extends Common{

public WebDriver driver;
	
	public Diabetes(WebDriver driver)
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
	
	public Glaucoma NextButton()
	{
		next().click();
		Glaucoma gl = new Glaucoma(driver);
		return gl;
	}
}