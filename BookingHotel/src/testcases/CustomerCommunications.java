package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CustomerCommunications 
{
  @Test
  public void checkMail(ITestContext context)
  {
	  System.out.println("checkMail");
	  String bookingID = (String)context.getAttribute("bID");
	  System.out.println(bookingID);
  }
  
  @Test
  public void checkMobile()
  {
	  System.out.println("checkMobile");
  }
}
