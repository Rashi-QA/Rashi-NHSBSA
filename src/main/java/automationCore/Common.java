package automationCore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Common {
	
    public WebDriver driver;
	
	private By yesButton = By.id("radio-yes");
	private By noButton = By.id("radio-no");
	private By Nextbutton = By.id("next-button");
	
	public Common (WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement accept()
	{
		return driver.findElement(yesButton);
	}
	
	public WebElement decline()
	{
		return driver.findElement(noButton);
			
	}
	
	public WebElement next()
	{
		return driver.findElement(Nextbutton);
	}
	
	public WebElement clickWebElementByText(By byWebElement, String elementText) throws Exception {
        List<WebElement> radioButtons = returnWebElementList(byWebElement);
        for(WebElement radioButton:radioButtons){
            if(radioButton.getText().equals(elementText))
                radioButton.click();
            return radioButton;
        }
        throw new Exception("No such element exist");
    }
	
	 public List<WebElement> returnWebElementList(By byWebElement){
//       By radioElements = By.cssSelector("[class *= 'selection-button-radio']");
       List<WebElement> webElements= driver.findElements(byWebElement);
       return webElements;
   }
	
}
