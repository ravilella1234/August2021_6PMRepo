package com.project;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_003 extends BaseTest
{
	
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String bType) throws Exception 
  {
	    init();
		test = report.createTest("TNG_003");
		test.log(Status.INFO, "Init the Properties files.... ");
				
		launch(bType);
		test.log(Status.PASS, "Opened the Browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigated to url :- " + childProp.getProperty("amazonurl"));
  }

  @Test
  public void f() 
  {
	    selectOption("amazondropdown_id","Books");
		test.log(Status.PASS, "Selecting the option Books By using the locator :-" + orProp.getProperty("amazondropdown_id"));
		
		type("amazonsearchtextbox_name","Harry Potter");
		test.log(Status.PASS, "Entered the text  Harry Potter By using the locator :- " + orProp.getProperty("amazonsearchtextbox_name"));
				
		clickElement("amazonsearchbotton_xpath");	
		test.log(Status.PASS, "Clicked on Element By using locator :- " + orProp.getProperty("amazonsearchbotton_xpath"));
  }
  
  
  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
	  report.flush();
  }

}
