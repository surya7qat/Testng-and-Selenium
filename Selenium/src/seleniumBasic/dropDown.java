package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-origins-allow");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		d.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement sel1 = d.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select sel = new Select(sel1);
		sel.selectByIndex(100);
		Thread.sleep(2000);
		sel.selectByValue("ATG");
		Thread.sleep(2000);
		sel.selectByVisibleText("Austria");
	}

}
