package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoComplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-origins-allow=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		d.get("https://demo.automationtesting.in/AutoComplete.html");
		WebElement textBox = d.findElement(By.xpath("//input[@id=\"searchbox\"]"));
		textBox.sendKeys("i");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );
		List<WebElement> list =d.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/li"));
		for(WebElement forlist : list ) {
			if(forlist.getText().equals("India")) {
				forlist.click();
				break;
			}
		}

	}

}
