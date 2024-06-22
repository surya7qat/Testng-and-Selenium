package seleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleClick_rightClick {

	private static Actions act;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-origins-allow=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		d.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement dc = d.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions	act = new Actions(d);
		act.doubleClick(dc).perform();
		Alert alt = d.switchTo().alert();
		Thread.sleep(1000);
		alt.accept();
		
		WebElement rc = d.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(rc).perform();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[5]")).click();
		alt.accept();
		
		

	}

}
