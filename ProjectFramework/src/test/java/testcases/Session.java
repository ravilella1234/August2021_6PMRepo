package testcases;

import org.testng.annotations.Test;

import bases.BaseTest;

public class Session extends BaseTest
{
	
  @Test
  public void doLogin() 
  {
	  System.out.println("Logging In...");
	  //test.log(Status.INFO, "Logging In...");
	  app.log("Logging In...");
	  app.openBrowser("chrome");
	  app.navigate("rediffurl");
	  //Forcely iam generating softassert failure 
	  app.reportFailure("Title is not matching", false);
	  app.reportFailure("Test is incorrect", false);
	  app.type("emailid_id", "rediffuser");
	  app.type("emailpassword_name", "rediffpassword");
	  app.click("submit_id");
	  app.assertAll();
  }
  
  @Test
  public void doLogout() 
  {
	  System.out.println("Logging Out...");
	 // test.log(Status.INFO, "Logging Out...");
	  app.log("Logging Out...");
	
  }
  
}
