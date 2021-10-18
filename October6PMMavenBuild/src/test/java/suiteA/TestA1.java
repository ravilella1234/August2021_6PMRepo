package suiteA;

import org.testng.annotations.Test;

public class TestA1
{
  @Test
  public void testA1() throws Exception 
  {
	  System.out.println("Starting testA1");
	  
	  Thread.sleep(5000);
	  
	  System.out.println("Ending testA1");
  }
}
