package keywords;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords 
{
	 public static  String projectpath = System.getProperty("user.dir");
	 public WebDriver driver;
	 Properties mainProp;
	 Properties childProp;
	 Properties orProp;
	 public ExtentTest test;
	 public SoftAssert softAssert;
	 
	
	 public void openBrowser(String browser)
	 {
		 System.out.println("Opening the Browser :" + browser);
		 //test.log(Status.INFO, "Opening the Browser :" + browser);
		 log("Opening the Browser :" + browser);
		 
		 if(browser.equals("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		 }else if(browser.equals("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
	 }
	 
	 public void navigate(String url)
	 {
		 System.out.println("Navigate to :- " +  url);
		// test.log(Status.INFO, "Navigate to :- " +  url);
		 log("Navigate to :- " +  url);
		 driver.get(childProp.getProperty(url));
	 }
	 
	 public void type(String locatorKey,String text)
	 {
		 System.out.println("Typig text : "+ locatorKey +" Data : " +  text);
		// test.log(Status.INFO, "Typig text : "+ locatorKey +" Data : " +  text);
		 log("Typig text : "+ childProp.getProperty(text) +" with Locator : " +  orProp.getProperty(locatorKey));
		 getElement(locatorKey).sendKeys(childProp.getProperty(text));
	 }
	 
	 public void click(String locatorKey)
	 {
		 System.out.println("Clicking on :- " + locatorKey);
		 //test.log(Status.INFO, "Clicking on :- " + locatorKey);
		 log("Clicking on :- " + locatorKey);
		 getElement(locatorKey).click();
	 }
	 
	 public void select()
	 {
		 
	 }
	 
	 public String getText()
	 {
		 
		return null; 
	 }
	 
	 
	 public WebElement getElement(String locatorKey) 
	{
		 WebElement element = null;
			//check for presence of Element
			if(!isElementPresent(locatorKey))
			{
				//report the failure
				System.out.println("Element is not present : " + locatorKey);
				reportFailure("Element is not present : " + locatorKey, true);
			}
			else
			{
				element = driver.findElement(getLocator(locatorKey));
			}
			return element;
	}

		
		public  boolean isElementPresent(String locatorKey) 
		{
			System.out.println("Checking ElementPresent :- " + locatorKey);
			log("Checking ElementPresent :- " + locatorKey);
			WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(30));
			
			try 
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator(locatorKey)));
			} 
			catch (Exception e) 
			{
				return false;
			}
			return true;
		}
		
		public  By getLocator(String locatorKey)
		{
			By by = null;
			
			if(locatorKey.endsWith("_id")) {
				by = By.id(orProp.getProperty(locatorKey));
			}else if(locatorKey.endsWith("_name")) {
				by = By.name(orProp.getProperty(locatorKey));
			}else if(locatorKey.endsWith("_classname")) {
				by = By.className(orProp.getProperty(locatorKey));
			}else if(locatorKey.endsWith("_xpath")) {
				by = By.xpath(orProp.getProperty(locatorKey));
			}else if(locatorKey.endsWith("_css")) {
				by = By.cssSelector(orProp.getProperty(locatorKey));
			}else if(locatorKey.endsWith("_linktext")) {
				by = By.linkText(orProp.getProperty(locatorKey));
			}else if(locatorKey.endsWith("_partiallinktext")) {
				by = By.partialLinkText(orProp.getProperty(locatorKey));
			}
			
			return by;
			
		}
	
		public void setReport(ExtentTest test)
		{
			this.test = test;
		}
		
		//Reporting Functions
		public void log(String msg)
		{
			test.log(Status.INFO, msg);
		}
		
		public void reportFailure(String failureMsg, boolean stopOnFailure)
		{
			System.out.println(failureMsg);
			test.log(Status.FAIL, failureMsg);
			softAssert.fail(failureMsg);
			
			if(stopOnFailure)
				assertAll(); // report all the failures
				
		}
		
		public void assertAll()
		{
			Reporter.getCurrentTestResult().getTestContext().setAttribute("criticalFailure", "Y");
			softAssert.assertAll();
		}
	
}
