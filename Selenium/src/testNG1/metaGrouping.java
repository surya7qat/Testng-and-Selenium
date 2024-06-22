package testNG1;

import org.testng.annotations.Test;

public class metaGrouping {
	 @Test(groups = {"animal"})
	  public void lion() {
		  System.out.println("lion");
	  }
	  @Test(groups = {"bird"})
	  public void peacock() {
		  System.out.println("peacock");
	  }
	  @Test(groups = {"animal"})
	  public void tiger() {
		  System.out.println("tiger");
	  }
	  @Test(groups = {"animal","bird"})
	  public void catparrot() {
		  System.out.println("catparrot");
	  }
	  @Test(groups = "bird")
	  public void kingfisher() {
		  System.out.println("kingfisher");
	  }
  
}
