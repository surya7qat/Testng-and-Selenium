package seleniumBasic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-origins-allow=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		d.get("https://demoqa.com/menu/");
		Thread.sleep(3000);
		//File sr = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(sr, new File("C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Screenshot\\shot1.png"));
		//d.close();
		File sr = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new File("C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Screenshot\\shot1.png"));
		d.close();
	
	}

}
