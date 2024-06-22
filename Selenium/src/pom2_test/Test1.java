package pom2_test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.chromeOpen;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom1_page.homePage;
import pom1_page.signInPage;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class Test1 {
	WebDriver d;
  @Test(priority = 01)
  public void homepagefull () throws InterruptedException {
	  homePage hm = new homePage(d);
	  hm.getTextHeader();
	  Thread.sleep(3000);
	  hm.clickOnGetStarted();
  }
  @SuppressWarnings("deprecation")
@Test(priority = 02)
  public void signInPageFull() throws InterruptedException {
	  signInPage sip = new signInPage(d);
	  sip.typeName("surya");
	  sip.typeEmail("surya14057@gmail.com");
	  sip.typePassword("surya65");
	  d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  sip.clickAgree();
	  sip.clickSignMe();
  }
  @BeforeClass
  public void beforeClass() {
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("--remote-origins-allow=*");
	  d = new ChromeDriver();
	  WebDriverManager.chromedriver().setup();
	  d.get("https://www.browserstack.com/");
	  
  }


}
