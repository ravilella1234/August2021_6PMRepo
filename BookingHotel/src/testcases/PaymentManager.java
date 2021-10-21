package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager 
{
  @Test
  public void applyDiscount() 
  {
	  System.out.println("applyDiscount");
  }
  
  @Parameters({"action"})
  @Test
  public void makePayment(String paymentType,ITestContext context) 
  {
	  if(paymentType.equals("instantpayment"))
		  System.out.println("Make InstantPayment");
	  else
		  System.out.println("Pay@hotel");
	  
	  //booking Number
	  String bookingID = "ravi1234";
	  System.out.println(bookingID);
	  context.setAttribute("bID", bookingID);
  }
}
