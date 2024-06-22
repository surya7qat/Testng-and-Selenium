package testNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class annotation {
	WebDriver d;
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webDriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
	  d= new ChromeDriver();
	  d.get("https://www.leafground.com/input.xhtml");
	  
  }

  @AfterClass
  public void afterClass() {
	  d.close();
  }


  @Test
  public void f() throws InterruptedException {
	WebElement tigger =  d.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[2]/div/div[2]/span"));
	for(int i = 1;i<=50;i++)
	{
		tigger.sendKeys(Keys.ARROW_RIGHT);
	}
	Thread.sleep(2000);
	  
    
  }
}
