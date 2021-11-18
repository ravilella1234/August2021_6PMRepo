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

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords extends ValidationKeywords
{
	 public String projectpath = System.getProperty("user.dir");
	 public WebDriver driver;
	 Properties mainProp;
	 Properties childProp;
	 Properties orProp;
	 
	
	 public void openBrowser(String browser)
	 {
		 System.out.println("Opening the Browser :" + browser);
		 
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
		 driver.get(childProp.getProperty(url));
	 }
	 
	 public void type(String locatorKey,String text)
	 {
		 System.out.println("Typig text : "+ locatorKey +" Data : " +  text);
		 getElement(locatorKey).sendKeys(text);
	 }
	 
	 public void click(String locatorKey)
	 {
		 System.out.println("Clicking on :- " + locatorKey);
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
			//check for presence of Element
			if(!isElementPresent(locatorKey))
				//report the failure
				System.out.println("Element is not present : " + locatorKey);
			
			WebElement element = null;
			element = driver.findElement(getLocator(locatorKey));
			
			return element;
			
		}

		
		public  boolean isElementPresent(String locatorKey) 
		{
			System.out.println("Checking ElementPresent :- " + locatorKey);
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
	
	
}
