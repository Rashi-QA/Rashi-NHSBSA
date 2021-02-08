package automationCore;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver drive;
	public Properties prop;

	public WebDriver initialiseDriver() throws IOException
	{
		 prop = new Properties();
		FileInputStream FIS= new FileInputStream("C:\\Selenium\\NHS\\src\\main\\java\\resources\\data.properties");
		prop.load(FIS);
		String BrowserName = prop.getProperty("browser");
	
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
			ChromeOptions options= new ChromeOptions();
			if(BrowserName.contains("headless"))
			{
			options.addArguments("headless");
			}
			 drive = new ChromeDriver(options);
		}
		else if (BrowserName.equals("firefox"))
		{
		    System.setProperty("webdriver.gecko.driver","C:\\GeckoDriver\\geckodriver.exe" );  
		     drive= new FirefoxDriver();  
		}
		
		
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		return drive;
	}
}