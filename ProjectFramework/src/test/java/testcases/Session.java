package testcases;

import org.testng.annotations.Test;

import bases.BaseTest;

public class Session extends BaseTest
{
	
  @Test
  public void doLogin() 
  {
	  System.out.println("Logging In...");
	  
  }
  
  @Test
  public void doLogout() 
  {
	  System.out.println("Logging Out...");
	
  }
  
}
