package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--remore-allow-origins=*");
		WebDriver d;
		//WebDriverManager.chromedriver().setup();
		d= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
//		d.get("https://www.w3schools.com/java/default.asp");
		d.switchTo().frame(d.findElement(By.xpath("//*[@id=\"google_ads_iframe_/22152718,16833175/sws-hb//w3schools.com//main_leaderboard_0\"]")));
		d.switchTo().frame(0);
		WebElement iframe = d.findElement(By.xpath("/html/body"));
		iframe.click();
		System.out.println(iframe.getText());
		d.switchTo().parentFrame();
		//d.switchTo().defaultContent();
		
		
		
		
			

	}

}
