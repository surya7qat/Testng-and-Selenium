package seleniumBasic;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://jqueryui.com/datepicker/");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.switchTo().frame(0);
		d.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("09/09/2000"+Keys.ENTER);
		d.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		d.findElement(By.xpath("//span[text()='Next']")).click();
		d.findElement(By.xpath("//a[@data-date='14']")).click();
		
		
	}

}
