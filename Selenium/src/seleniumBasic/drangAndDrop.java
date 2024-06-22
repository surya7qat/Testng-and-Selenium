package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drangAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-origins-allow=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		d.get("https://ui.vision/demo/webtest/dragdrop/");
		Actions act = new Actions(d);
		WebElement drop = d.findElement(By.xpath("//*[@id=\"bin\"]"));
		WebElement one = d.findElement(By.id("one"));
		WebElement two = d.findElement(By.id("two"));
		WebElement three = d.findElement(By.id("three"));
		WebElement four = d.findElement(By.id("four"));
		WebElement five = d.findElement(By.id("five"));
		act.dragAndDrop(one, drop).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(two, drop).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(three, drop).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(four, drop).build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(five, drop).build().perform();
		
		;

	}

}
