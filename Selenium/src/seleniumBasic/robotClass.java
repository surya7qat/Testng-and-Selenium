package seleniumBasic;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--incognito");
		WebDriver d;
		WebDriverManager.firefoxdriver().setup();
		d = new FirefoxDriver();
		d.navigate().to("http://ww.google.com");
		Robot ro = new Robot();
		WebElement gmail = d.findElement(By.cssSelector("a.gb_B"));
		Actions act = new Actions(d);
		act.contextClick(gmail).build().perform();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
//		extra
//		d.get("https://www.leafground.com/input.xhtml");
//		WebElement rc = d.findElement(By.cssSelector("input#j_idt88\\:j_idt91"));
//		Actions act1 = new Actions(d);
//		Robot ro1 = new Robot();
//		rc.sendKeys("mama");
//		Thread.sleep(1000);
//		act1.contextClick(rc).build().perform();
//		ro1.keyPress(KeyEvent.VK_DOWN);
//		ro1.keyRelease(KeyEvent.VK_DOWN);
//		ro1.keyPress(KeyEvent.VK_ENTER);
//		
	
		

	}

}
