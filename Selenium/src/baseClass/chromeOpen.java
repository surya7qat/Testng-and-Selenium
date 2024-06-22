package baseClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class chromeOpen {
	protected WebDriver d;
  @Test
  public void f() throws InterruptedException {
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      d= new ChromeDriver();
      d.get("https://www.globalsqa.com/demo-site/tooltip/#Image%20Based");
  }

  @AfterClass
  public void afterClass() {
	  d.close();
  }

}
