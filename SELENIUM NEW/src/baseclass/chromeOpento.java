package baseclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class chromeOpento {
	protected WebDriver d;
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webDriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\Desktop\\\\Surya\\\\Selenium\\\\Driver\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	  d = new ChromeDriver();
      d.get("http://www.google.com");
  }

  @AfterClass
  public void afterClass() {
	  d.close();
  }

}
