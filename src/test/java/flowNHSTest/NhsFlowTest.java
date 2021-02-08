package flowNHSTest;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automationCore.Base;
import pageObjects.CareHomePage;
import pageObjects.DOBPage;
import pageObjects.DiabetesPage;
import pageObjects.GlaucomaPage;
import pageObjects.InjuryOrIllnessPage;
import pageObjects.OutcomePage;
import pageObjects.PartnerPage;
import pageObjects.PregnantorGivenBirthPage;
import pageObjects.SavingsorPropertyPage;
import pageObjects.HomePage;
import pageObjects.TaxBenefitsPage;
import pageObjects.CountryPage;

public class NhsFlowTest extends Base {
	
	private HomePage homepage;
	/*private CountryPage countrypage;
	private DOBPage dateofBirth;
	private PartnerPage partnerpage;
	private TaxBenefitsPage TaxPage;
	private PregnantorGivenBirthPage pregnantorbirthpage;
	private InjuryOrIllnessPage injurypage;
	private DiabetesPage diabetespage;
	private GlaucomaPage glaucomapage;
	private CareHomePage homecarepage;
	private SavingsorPropertyPage savingspage;
	private OutcomePage outcomepage;*/
	
	@BeforeMethod
	public void initialization() throws IOException
	{
		drive = initialiseDriver();
		String URL = prop.getProperty("url");
		System.out.println(URL);
		drive.get(prop.getProperty("url"));
	}

	//@BeforeMethod
	//public void createPages() throws IOException, InterruptedException
	//{
		//homepage = new HomePage(drive);
		//homepage.AcceptCookies().click();
	//}
	
	
		@AfterTest
	public void Windup()
	{
		drive.close();
	}
}
