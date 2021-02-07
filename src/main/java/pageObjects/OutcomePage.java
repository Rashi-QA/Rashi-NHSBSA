package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OutcomePage {

public WebDriver driver;
	
	public OutcomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By prescription_id = By.id("wales-prescription-restriction");
	
	public WebElement prescriptionOutcome()
	{
		return driver.findElement(prescription_id);
    }
	
	
}
