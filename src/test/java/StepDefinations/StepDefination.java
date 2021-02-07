package StepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.StartPage;
import pageObjects.WhereYouLive;

import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;

@RunWith(Cucumber.class)
public class StepDefination
{

    @Given("^I am a person from Wales$")
    public void i_am_a_person_from_wales() throws Throwable {
    	
    }

    @When("^I put my circumstances into the checker tool$")
    public void i_put_my_circumstances_into_the_checker_tool() throws Throwable {
  
    }

    @Then("^I should get a result of wheather i will get help or not$")
    public void i_should_get_a_result_of_wheather_i_will_get_help_or_not() throws Throwable {
     
    }

}