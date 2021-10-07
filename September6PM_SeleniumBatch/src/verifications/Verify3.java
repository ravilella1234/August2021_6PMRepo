package verifications;

import com.aventstack.extentreports.Status;
import com.launchings.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("Verify3");
		test.log(Status.INFO, "Init the Properties files.... ");
				
		launch("chromebrowser");
		test.log(Status.PASS, "Opened the Browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigated to url :- " + childProp.getProperty("amazonurl"));
		
		String expectedLink = "Customer Serv";
		
		if(!isLinkEqual(expectedLink))
			//System.out.println("Both Links are not equal..");
			reportFailure("Both Links are not equal...");
		else
			//System.out.println("Both Links are equal...");
			reportSuccess("Both Links are equal...");
		
		report.flush();
	}
}
