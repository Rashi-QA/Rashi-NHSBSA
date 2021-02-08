package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePage;
import pageObjects.InjuryOrIllnessPage;
import pageObjects.OutcomePage;
import pageObjects.PartnerPage;
import pageObjects.PregnantorGivenBirthPage;
import pageObjects.SavingsorPropertyPage;
import pageObjects.TaxBenefitsPage;
import pageObjects.CareHomePage;
import pageObjects.CountryPage;
import pageObjects.DOBPage;
import pageObjects.DiabetesPage;
import pageObjects.GlaucomaPage;
import flowNHSTest.NhsFlowTest;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import automationCore.Base;

@RunWith(Cucumber.class)
public class StepDefination extends Base
{
	private HomePage homepage;
	private CountryPage countrypage;
	private DOBPage dateofBirth;
	private PartnerPage partnerpage;
	private TaxBenefitsPage TaxPage;
	private PregnantorGivenBirthPage pregnantorbirthpage;
	private InjuryOrIllnessPage injurypage;
	private DiabetesPage diabetespage;
	private GlaucomaPage glaucomapage;
	private CareHomePage homecarepage;
	private SavingsorPropertyPage savingspage;
	private OutcomePage outcomepage;
	private WebDriver drive;
	
	public void initialization() throws IOException
	{
		drive = initialiseDriver();
		String URL = prop.getProperty("url");
		System.out.println(URL);
		drive.get(prop.getProperty("url"));
	}
	
    @Given("^I am a person from Wales$")
    public void i_am_a_person_from_wales() throws Throwable {
    	
    	initialization();
    	homepage = new HomePage(drive);
		//homepage.AcceptCookies().click();
    	countrypage =  homepage.GetStarted();
		 JavascriptExecutor jse = (JavascriptExecutor)drive;
		jse.executeScript("arguments[0].click()", countrypage.SelectWales());
		Thread.sleep(1000);
    }

    @When("^I put my circumstances into the checker tool$")
    public void i_put_my_circumstances_into_the_checker_tool() throws Throwable {
    	dateofBirth = countrypage.Next();
		dateofBirth.setCompleteDOB("11", "01", "1986");
		
		partnerpage = dateofBirth.nextbutton();
        partnerpage.Nopartnersupport();
		
        TaxPage = partnerpage.Nextbutton();
        TaxPage.noTaxBenefits();
        
        pregnantorbirthpage = TaxPage.Nextbutton();
        pregnantorbirthpage.notPregnantorgivenBirth();
        
        injurypage= pregnantorbirthpage.Nextbutton();
        injurypage.NoInjury();
        
        diabetespage = injurypage.Next();
        diabetespage.NoDiabetes();
        
        glaucomapage = diabetespage.NextButton();
        glaucomapage.NoGlaucoma();
        
        homecarepage = glaucomapage.NextButton();
        homecarepage.notInCareHome();
        
        savingspage = homecarepage.NextButton();
        savingspage.NoElegible();
        
        outcomepage = savingspage.Nextbutton();
			
    }

    @Then("^I should get a result of wheather i will get help or not$")
    public void i_should_get_a_result_of_wheather_i_will_get_help_or_not() throws Throwable {
        
    	String outcomeMessage= outcomepage.result().getText();
    	 
    	if(outcomeMessage.equalsIgnoreCase("You get help with NHS costs"))
    	 
    		 {
    		 System.out.println("Help will be provided by NHS");
    			 }
    	 else
    	 {
    		 System.out.println("Help will not be provided by NHS"); 
    	 }
    }

}