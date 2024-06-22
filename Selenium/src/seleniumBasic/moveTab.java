package seleniumBasic;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moveTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--incognito");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		d.navigate().to("http://www.google.com");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		((JavascriptExecutor)d).executeScript("window.open()");
		ArrayList<String> tab2 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab2.get(1));
		d.navigate().to("http://www.amazon.com");
		Thread.sleep(2000);
		
		((JavascriptExecutor)d).executeScript("window.open()");
		ArrayList<String> tab3 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab3.get(2));
		d.get("http://www.flipkart.com");
		Thread.sleep(2000);
		
		ArrayList<String> tabchange1 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabchange1.get(0));
		Thread.sleep(2000);
		
		((JavascriptExecutor)d).executeScript("window.open()");
		ArrayList<String> tab4 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tab4.get(3));
		d.get("http://www.bookmyshow.com");
		
		
		}

}
