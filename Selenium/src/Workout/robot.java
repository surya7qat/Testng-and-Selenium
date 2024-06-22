package Workout;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumBasic.robotClass;

public class robot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allo-origins=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		d.navigate().to("https://www.google.co.in/");
		WebElement textbox = d.findElement(By.id("APjFqb"));
		textbox.sendKeys("surya");
		Actions act = new Actions(d);
		act.contextClick(textbox).perform();
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(3000);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		act.contextClick(textbox).perform();
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(3000);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
        act.contextClick(textbox).perform();
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);

		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);

		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(3000);

		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
        act.contextClick(textbox).perform();
        Thread.sleep(3000);

		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);

		
		
	}

}
