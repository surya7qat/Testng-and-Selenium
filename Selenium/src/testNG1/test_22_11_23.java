package testNG1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class test_22_11_23 {
	WebDriver d;
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-origins-allow=*");
		ChromeDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
  }

  @AfterTest
  public void afterTest() {
	  d.close();
	  }


  @Test
  public void blank() throws InterruptedException {
	  WebElement un = d.findElement(By.id("txt_unam"));
	  WebElement pw = d.findElement(By.id("txt_pass"));
	  WebElement lg = d.findElement(By.id("Button3"));
	  un.sendKeys("");
	  pw.sendKeys("");
	  lg.click();
	  Alert alt1 = d.switchTo().alert();
	  alt1.accept();
	  Thread.sleep(3000);
	  
    
  }
  @Test
  public void invalid() throws InterruptedException {
	  WebElement un = d.findElement(By.id("txt_unam"));
	  WebElement pw = d.findElement(By.id("txt_pass"));
	  WebElement lg = d.findElement(By.id("Button3"));
	  un.sendKeys("surya123");
	  pw.sendKeys("ananth123");
	  lg.click();
	  Alert alt1 = d.switchTo().alert();
	  alt1.accept();
	  Thread.sleep(3000);
	  
    
  }
  @Test
  public void illegal() throws InterruptedException {
	  WebElement un = d.findElement(By.id("txt_unam"));
	  WebElement pw = d.findElement(By.id("txt_pass"));
	  WebElement lg = d.findElement(By.id("Button3"));
	  un.sendKeys("!@#");
	  pw.sendKeys("*/");
	  lg.click();
	  Alert alt1 = d.switchTo().alert();
	  alt1.accept();
	  Thread.sleep(3000);
	  
    
  }
}
