package testNG1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {

  @Test (priority = 01)
  public void sameequal() {
	  System.out.println("Started 1");
	  SoftAssert ass = new SoftAssert();
	  ass.assertEquals(500, 500);
	  ass.assertAll();
	  System.out.println("Completed 1");
   
  }
  @Test (priority = 02)
  public void notsameequal() {
	  System.out.println("Started 2");
	  SoftAssert ass = new SoftAssert();
	  ass.assertEquals(500, 400);
	  System.out.println("Completed 2");
	  ass.assertAll();
	  
   
  }
  @Test (priority = 03)
  public void samenotequal() {
	  System.out.println("Started 3");
	  SoftAssert ass = new SoftAssert();
	  ass.assertNotEquals(500, 500);
	  ass.assertAll();
	  System.out.println("Completed 3");
   
  }
  @Test (priority = 04)
  public void notsamenotequal() {
	  System.out.println("Started 4");
	  SoftAssert ass = new SoftAssert();
	  ass.assertNotEquals(500, 400);
	  ass.assertAll();
	  System.out.println("Completed 4");
	  
   
  }
  @Test (priority = 05)
  public void trueTrue() {
	  System.out.println("Started 5");
	  SoftAssert ass = new SoftAssert();
	  ass.assertTrue(true);
	  ass.assertAll();
	  System.out.println("Completed 5");
   
  }
  @Test (priority = 06)
  public void trueFalse() {
	  System.out.println("Started 6");
	  SoftAssert ass = new SoftAssert();
	  ass.assertTrue(false);
	  ass.assertAll();
	  System.out.println("Completed 6");
	  
   
  }
}
