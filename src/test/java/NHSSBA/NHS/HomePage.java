package NHSSBA.NHS;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.DOB;
import pageObjects.Partner;
import pageObjects.StartPage;
import pageObjects.WhereYouLive;
import resources.Base;

public class HomePage extends Base {
	
	@BeforeTest
	public void initialization() throws IOException
	{
		drive = initialiseDriver();
		String UR = prop.getProperty("url");
		System.out.println(UR);
		drive.get(prop.getProperty("url"));
	}

	@Test
	public void navigateToHomePage() throws IOException
	{
		
		StartPage Sp = new StartPage(drive);
		Sp.AcceptCookies().click();
		Sp.GetStarted().click();
		WhereYouLive country = new WhereYouLive(drive);
		JavascriptExecutor jse = (JavascriptExecutor)drive;
		jse.executeScript("arguments[0].click()", country.SelectWales());
		country.Next().click();
		DOB db = new DOB(drive);
		db.day().sendKeys("12");
		db.month().sendKeys("11");
		db.year().sendKeys("1992");
		db.nextbutton().click();
		Partner partnerobj = new Partner(drive);
		JavascriptExecutor js = (JavascriptExecutor)drive;
		js.executeScript("arguments[0].click()", partnerobj.Nopartnersupport());
		partnerobj.Nextbutton().click();
}
	
	@AfterTest
	public void Windup()
	{
		drive.close();
	}
}
