package testNG1;

import org.testng.annotations.Test;

public class dependOn {
	//Without using priority it automatically priortising because it depend on other
	//use false to it make no test will run
	@Test(enabled = true)
	public void sslc() {
		System.out.println("sslc");
	}
	@Test(dependsOnMethods = "sslc")
	public void higherSecondary() {
		System.out.println("higherSceondary");
	}
	@Test(dependsOnMethods = "higherSecondary")
	public void College() {
		System.out.println("college");
	}
}
