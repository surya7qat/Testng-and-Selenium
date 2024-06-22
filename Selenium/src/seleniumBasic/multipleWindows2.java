package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleWindows2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.leafground.com/window.xhtml");
		String oldWindow = d.getWindowHandle();
		d.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span")).click();
		java.util.Set<String> multipleWindows=d.getWindowHandles();
		for(String newWindows : multipleWindows) {
			d.switchTo().window(newWindows);
		}
		d.close();
		d.switchTo().window(oldWindow);
		d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span")).click();
		d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]")).click();
		System.out.println(multipleWindows.size());
		for(String newWindows : multipleWindows) {
			if(!newWindows.equals(oldWindow)) {
				d.switchTo().window(newWindows);
				d.close();
			}
		}
		d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]/span")).click();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for(String newWindows : multipleWindows) {
			if(!newWindows.equals(oldWindow)) {
				d.switchTo().window(newWindows);
				d.close();
			}
		}
			
		
		

	}

	}
