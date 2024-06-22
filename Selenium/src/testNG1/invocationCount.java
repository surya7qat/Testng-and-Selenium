package testNG1;

import org.testng.annotations.Test;

public class invocationCount {

  @Test(invocationCount = 10)
  public void f() {
	  System.out.println(1+1);
  
  }
}
