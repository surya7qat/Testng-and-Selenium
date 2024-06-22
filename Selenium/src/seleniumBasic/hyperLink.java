package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hyperLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.leafground.com/link.xhtml");
		WebElement dashboard = d.findElement(By.linkText("Go to Dashboard"));
		dashboard.click();
		Thread.sleep(3000);
		d.navigate().back();
		WebElement findUrl = d.findElement(By.linkText("Find the URL without clicking me."));
		String url =findUrl.getAttribute("href");
		System.out.println(url);
		WebElement broken = d.findElement(By.linkText("Broken?"));
		broken.click();
		String title = d.getTitle();
		if(title.contains("404")) {
			System.out.println("It is broken");
		}
		else {
			System.out.println("It is not broken");
		}
		d.navigate().back();
		WebElement dashboard2 = d.findElement(By.linkText("Go to Dashboard"));
		dashboard2.click();
		d.navigate().back();
		List<WebElement> list =d.findElements(By.tagName("a"));
		System.out.println(list.size());

	}

}
