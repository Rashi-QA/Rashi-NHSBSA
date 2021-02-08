package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import automationCore.Base;
import automationCore.Common;


public class DOBPage extends Common {

public WebDriver driver;
	
	public DOBPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	private By day = By.name("dateOfBirth.day");
	private By month = By.id("dob-month");
	private By year = By.id("dob-year");
	private By next = By.id("next-button");
	
	public WebElement day()
	{
		return driver.findElement(day);
	}
	
	public WebElement month()
	{
		return driver.findElement(month);
	}
	
	public WebElement year()
	{
		return driver.findElement(year);
	}
	
	public void setDOBValues(DOB_COMPONENT dobComponent, String value)
    {
        By byWebElement;
        switch (dobComponent)
        {
            case DAY:
                byWebElement=day;
                break;
            case MONTH:
                byWebElement=month;
                break;
            default:
                byWebElement=year;
                break;
        }
          driver.findElement(byWebElement).sendKeys(value);
        }

        public void setCompleteDOB(String day, String month, String year){
        setDOBValues(DOB_COMPONENT.DAY,day);
        setDOBValues(DOB_COMPONENT.MONTH,month);
        setDOBValues(DOB_COMPONENT.YEAR,year);
        }

    public enum DOB_COMPONENT{
        DAY, MONTH, YEAR;
    }
    
	public PartnerPage nextbutton()
	{
		driver.findElement(next).click();
		PartnerPage partnerpage = new PartnerPage(driver);
		return partnerpage;
	}
	
}

	
