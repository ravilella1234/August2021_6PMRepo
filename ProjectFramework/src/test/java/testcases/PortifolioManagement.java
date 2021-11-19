package testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import bases.BaseTest;

public class PortifolioManagement extends BaseTest
{
	
  @Test
  public void createportifolio()
  {
	System.out.println("Creating Portifolio");  
	test.log(Status.INFO, "Creating Portifolio");
  }
  
  @Test
  public void deleteportifolio()
  {
	  System.out.println("Deleting Portifolio");
	  test.log(Status.INFO, "Deleting Portifolio");
  }
}
