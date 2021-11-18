package bases;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import keywords.ApplicationKeywords;

public class BaseTest 
{
	public ApplicationKeywords app;
	
  
   @BeforeTest
   public void beforeTest(ITestContext context) throws Exception 
   {
	  System.out.println("--------------- Before test ------------");  
	  app = new ApplicationKeywords();
	  context.setAttribute("app", app);
	  app.openBrowser("chrome");
   }
	
   @BeforeMethod
   public void beforeMethod(ITestContext context)
   {
	  System.out.println("................... Before Method ...................");
	  ApplicationKeywords  app = (ApplicationKeywords)context.getAttribute("app");
   }

 

}
