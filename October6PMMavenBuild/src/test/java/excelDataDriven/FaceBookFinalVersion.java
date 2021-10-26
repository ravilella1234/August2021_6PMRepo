package excelDataDriven;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class FaceBookFinalVersion 
{
	WebDriver driver;
  
  @BeforeMethod
  public void startProcess()
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
  }
  
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> obj) throws Exception 
  {
	  if(obj.get("RunMode").equals("N"))
	  {
		  throw new SkipException("Test is Skipped Due to Runmode No....");
	  }
	  else
	  {
		  driver.findElement(By.id("email")).sendKeys(obj.get("UserName"));
		  driver.findElement(By.id("pass")).sendKeys(obj.get("UserPassword")); 
		  
		  Thread.sleep(5000);
	  }
	  
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e =new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testcaseName = "LoginTest";
		
		return DataUtils.getTestData(e, sheetName, testcaseName);
  }
  
  @AfterMethod
  public void endProcess()
  {
	  driver.quit();
  }
}
