package bases;

import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import keywords.ApplicationKeywords;
import reports.ExtentManager;

public class BaseTest 
{
	public ApplicationKeywords app;
	public ExtentReports rep;
	public ExtentTest test;
	
  
   @BeforeTest
   public void beforeTest(ITestContext context) throws Exception 
   {
	  System.out.println("--------------- Before test ------------");  
	  app = new ApplicationKeywords();
	  context.setAttribute("app", app);
	 
	  
	  //init the Reporting for the Test
	  rep = ExtentManager.getReports();
	  test =  rep.createTest(context.getCurrentXmlTest().getName());
	  
	  app.setReport(test);
	  context.setAttribute("Report", rep);
	  context.setAttribute("Test", test);
	  
	  
   }
	
   @BeforeMethod
   public void beforeMethod(ITestContext context)
   {
	  System.out.println("................... Before Method ...................");
	  app = (ApplicationKeywords)context.getAttribute("app");
	  rep = (ExtentReports)context.getAttribute("Report");
	  test = (ExtentTest)context.getAttribute("Test");
   }
   
   @AfterTest
   public void quit()
   {
	   if(rep!=null)
		   rep.flush();
   }

 

}
