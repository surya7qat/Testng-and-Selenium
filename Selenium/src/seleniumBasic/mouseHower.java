package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-origins-allow=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		d.get("https://demoqa.com/menu/");
		d.manage().window().maximize();
		Actions act = new Actions(d);
		WebElement main = d.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		act.moveToElement(main).perform();
		WebElement main2 = d.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
		act.moveToElement(main2).perform();
		WebElement main3 = d.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a"));
		act.moveToElement(main3).perform();
		
	}

}
