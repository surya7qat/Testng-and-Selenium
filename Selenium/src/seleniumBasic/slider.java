package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-origins-allow=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.leafground.com/input.xhtml");
		WebElement slider = d.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[2]/div/div[2]/span"));
		for(int i = 1 ;i<=80;i++)
		{slider.sendKeys(Keys.ARROW_RIGHT);
		}
		for(int i = 1 ;i<=10;i++)
		{slider.sendKeys(Keys.ARROW_LEFT);
		}
		for(int i1 = 70 ; i1>=51;i1-- )
		{
			slider.sendKeys(Keys.LEFT);
		}

	}

}
