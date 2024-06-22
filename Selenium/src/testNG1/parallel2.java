package testNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel2 {
  @Test
  public void openGoogle() {
	  System.setProperty("webDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      WebDriver d= new ChromeDriver();
      d.get("https://www.google.co.in");
  }
  @Test
  public void openBing() {
	  System.setProperty("webDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      WebDriver d= new ChromeDriver();
      d.get("https://www.bing.com");
  }
}
