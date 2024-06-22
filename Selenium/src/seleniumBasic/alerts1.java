package seleniumBasic;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver(opt);
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		d.get("https://demo.automationtesting.in/Alerts.html");
		
		
		 //single
		WebElement single1 = d.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		single1.click();
		Alert alt1 = d.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.accept();
		
		d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		
		//confimation
		WebElement confirmation = d.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		confirmation.click();
		System.out.println(alt1.getText());
		alt1.dismiss();
		
		d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
		//prompt
		WebElement prompt = d.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		prompt.click();
		alt1.sendKeys("Surya");
		System.out.println(alt1.getText());
		alt1.accept();

	}

}
