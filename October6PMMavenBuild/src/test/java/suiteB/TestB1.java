package suiteB;

import org.testng.annotations.Test;

public class TestB1 
{
  @Test
  public void testB1() throws Exception 
  {
	  System.out.println("Starting testB1");
	  
	  Thread.sleep(5000);
	  
	  System.out.println("Ending testB1");
  }
}
