package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Selenium\\NHS\\src\\test\\java\\Features",
			glue = "StepDefinations" )
	public class TestRunner 
	{
		
	}

