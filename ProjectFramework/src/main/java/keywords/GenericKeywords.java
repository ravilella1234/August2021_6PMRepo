package keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords extends ValidationKeywords
{
	 public WebDriver driver;
	
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
	 
	 public void navigate()
	 {
		 
	 }
	 
	 public void type()
	 {
		 
	 }
	 
	 public void click()
	 {
		 
	 }
	 
	 public void select()
	 {
		 
	 }
	 
	 public String getText()
	 {
		 
		return null; 
	 }
	
	
}
