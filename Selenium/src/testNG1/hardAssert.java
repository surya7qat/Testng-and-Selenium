package testNG1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardAssert {
	@Test (priority = 01)
	  public void sameequal() {
		  System.out.println("Started 1");
		  assertEquals(500, 500);
		  System.out.println("Completed 1");
	   
	  }
	  @Test (priority = 02)
	  public void notsameequal() {
		  System.out.println("Started 2");
		  assertEquals(500, 400);
		  System.out.println("Completed 2");
	   
	  }
	  @Test (priority = 03)
	  public void samenotequal() {
		  System.out.println("Started 3");
		  assertEquals(500, 500);
		  System.out.println("Completed 3");
	   
	  }
	  @Test (priority = 04)
	  public void notsamenotequal() {
		  System.out.println("Started 4");
		  assertEquals(500, 400);
		  System.out.println("Completed 4");
		  
	   
	  }
	  @Test (priority = 05)
	  public void trueTrue() {
		  System.out.println("Started 5");
		  assertTrue(true);
		  System.out.println("Completed 5");
	   
	  }
	  @Test (priority = 06)
	  public void trueFalse() {
		  System.out.println("Started 6");
		  assertTrue(false);
		  System.out.println("Completed 6");
	   
	  }
}
