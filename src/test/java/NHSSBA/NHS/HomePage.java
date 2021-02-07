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

import pageObjects.CareHome;
import pageObjects.DOB;
import pageObjects.Diabetes;
import pageObjects.Glaucoma;
import pageObjects.InjuryOrIllness;
import pageObjects.OutcomePage;
import pageObjects.Partner;
import pageObjects.PregnantorGivenBirth;
import pageObjects.SavingsorProperty;
import pageObjects.StartPage;
import pageObjects.TaxBenefits;
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
	public void navigateToHomePage() throws IOException, InterruptedException
	{
		
		StartPage Sp = new StartPage(drive);
		Sp.AcceptCookies().click();
		WhereYouLive country = Sp.GetStarted();
		JavascriptExecutor jse = (JavascriptExecutor)drive;
		jse.executeScript("arguments[0].click()", country.SelectWales());
		DOB db = country.Next();
		db.day().sendKeys("12");
		db.month().sendKeys("11");
		db.year().sendKeys("1992");
		Partner partnerobj = db.nextbutton();
		partnerobj.Nopartnersupport();
		TaxBenefits Tax = partnerobj.Nextbutton();
		Tax.noTaxBenefits();
		PregnantorGivenBirth PB= Tax.Nextbutton();
		PB.notPregnantorgivenBirth();
		InjuryOrIllness Il= PB.Nextbutton();
		Il.NoInjury();
		Diabetes Db = Il.Next();
		Db.NoDiabetes();
		Glaucoma gl = Db.NextButton();
		gl.NoGlaucoma();
		CareHome peramentincarehome = gl.NextButton();
		peramentincarehome.notInCareHome();
		SavingsorProperty sp = peramentincarehome.NextButton();
		sp.NoElegible();
		OutcomePage  Op = sp.Nextbutton();
		System.out.println(Op.prescriptionOutcome().getText());		
		
}
	
	@AfterTest
	public void Windup()
	{
		drive.close();
	}
}
