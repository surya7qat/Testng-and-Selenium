package seleniumBasic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--incognito");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		d.get("http://www.google.com");
		String tab1 = d.getWindowHandle();
		JavascriptExecutor java =(JavascriptExecutor)d;
		java.executeScript("window.scrollBy(0,1000)");
		((JavascriptExecutor) d).executeScript("window.open()");
		d.get("http://www.google.com");
		d.switchTo().window(tab1);
	}

}
