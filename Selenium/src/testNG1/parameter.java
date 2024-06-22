package testNG1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
 @Test
 @Parameters({"name","roll"})
  public void surya(String name,int roll) {
	  System.out.println("My name is "+name+"roll no is "+roll);
}
  }
