package Workout;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allo-origins=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		d.get("https://demo.automationtesting.in/Frames.html");
		((JavascriptExecutor)d).executeScript("window.scrollBy(0,6000)");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		File fl=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl, new File("C:\\Users\\ADMIN\\Desktop\\shot1.png"));
		d.close();

	}

}
