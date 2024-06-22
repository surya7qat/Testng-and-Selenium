package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		WebElement name = d.findElement(By.id("txt_unam"));
		name.sendKeys("sylix");
		WebElement pwd = d.findElement(By.id("txt_pass"));
		pwd.sendKeys("admin");
		WebElement submit =d.findElement(By.id("Button3"));
		submit.click();
		

	}

}
