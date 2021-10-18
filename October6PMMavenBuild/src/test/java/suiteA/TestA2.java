package suiteA;

import org.testng.annotations.Test;

public class TestA2
{
  @Test
  public void testA2() throws Exception 
  {
	  System.out.println("Starting testA2");
	  
	  Thread.sleep(5000);
	  
	  System.out.println("Ending testA2");
  }
}
