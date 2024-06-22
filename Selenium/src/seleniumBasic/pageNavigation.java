package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver(opt);
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.navigate().to("https://www.primevideo.com/");
		Thread.sleep(2000);
		d.navigate().to("https://www.netflix.com/in/");
		Thread.sleep(2000);
		d.get("https://www.hotstar.com/in/home?ref=%2Fin");
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
	
	}

}
