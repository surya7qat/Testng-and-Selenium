package testNG1;

import org.testng.annotations.Test;

public class withPriority {
	@Test(priority = -1)
	 public void a() {
		  System.out.println("apple");
	    
	  }
	  @Test(priority = 1)
	  public void c() {
		  System.out.println("cat");
	    
	  }
	  @Test(priority = 2)
	  public void b() {
		  System.out.println("ball");
	    
	  }
	  @Test(priority = 0)
	  public void d() {
		  System.out.println("dog");
	    
	  }
	  @Test
	  public void e() {
		  System.out.println("elephant");
	    
	  }

}
