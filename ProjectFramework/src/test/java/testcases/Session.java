package testcases;

import org.testng.annotations.Test;

import bases.BaseTest;

public class Session extends BaseTest
{
	
  @Test
  public void doLogin() 
  {
	  System.out.println("Logging In...");
	  app.navigate("rediffurl");
	  app.type("emailid_id", "ravilella2021@rediffmail.com");
  }
  
  @Test
  public void doLogout() 
  {
	  System.out.println("Logging Out...");
	
  }
  
}
