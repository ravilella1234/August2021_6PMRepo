package com.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class RadioButton1 extends BaseTest
{

	@BeforeMethod
	@Parameters("browser")
	  public void beforeMethod(String bType) throws Exception 
	  {
		init();
		test = report.createTest("RadioButton1");
		test.log(Status.INFO, "----------------   Started RadioButton1 ------------------------");
		test.log(Status.INFO, "initialising the dependency files...... ");
				
		launch(bType);
		test.log(Status.PASS, "Opening the browser :-" + p.getProperty("chromebrowser"));
				
		navigateUrl("radiourl");
		test.log(Status.INFO, "Navigated to :- " + childProp.getProperty("radiourl"));
	  }
	
	
	@Test
	public void radioButtonTest()
	{
		WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> rbutton=radio.findElements(By.name("group1"));
		for(int i=0;i<rbutton.size();i++)
		{
			System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
		}
	}
 

  @AfterMethod
  public void afterMethod() 
  {
	  report.flush();
	  
	  driver.quit();
  }
	
}
