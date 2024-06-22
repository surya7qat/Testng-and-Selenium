package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoRunn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.google.com");
	}

}
