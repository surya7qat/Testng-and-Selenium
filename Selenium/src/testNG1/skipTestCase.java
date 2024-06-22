package testNG1;

import org.testng.annotations.Test;

public class skipTestCase {
  @Test(enabled = false)
  public void f() {
	  System.out.println("skip");
  }
  @Test(enabled = true)
  public void e() {
	  System.out.println("print");
  }
  public void g() {
	  System.out.println("no test");
  }
}
