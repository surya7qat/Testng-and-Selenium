package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-origins-allow=*");
		WebDriver d;
		ChromeDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		d.get("https://www.amazon.in/ref=nav_logo");
		WebElement a1 = d.findElement(By.cssSelector("input#twotabsearchtextbox"));
		a1.sendKeys("Watch"+Keys.ENTER);
		WebElement a2 = d.findElement(By.cssSelector("span[class = 'a-size-base a-color-base']"));
		a2.click();

	}

}
