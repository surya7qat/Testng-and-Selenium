package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--remote-origins-allow=*");
		WebDriver d;
//		WebDriverManager.chromedriver().setup();
     	System.setProperty("webDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> col = d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th")); 
		System.out.println("column size = "+col.size());
		List<WebElement> row = d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		System.out.println("row size = "+row.size());
		
		for (int i =1; i<=3;i++ ) {
			d.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]/a")).click();
			Thread.sleep(2000);
			d.navigate().back();
//        d.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
//       for (int i =2; i<=5;i++ ) {
//			WebElement text = d.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td[1]"));
//			System.out.println(text.getText());
			
		}

	}

}
