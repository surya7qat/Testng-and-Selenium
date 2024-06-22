package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver d= new ChromeDriver();
        d.get("https://www.globalsqa.com/demo-site/tooltip/#Image%20Based");
        Actions a = new Actions(d);
        WebElement toolTip1 = d.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div/div/div/div/a[5]"));
        a.moveToElement(toolTip1).build().perform();
        toolTip1.click();
        }

}
