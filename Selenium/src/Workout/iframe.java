package Workout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allo-origins=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		d.get("https://demo.automationtesting.in/Frames.html");
		d.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		WebElement iframe =d.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		d.switchTo().frame(iframe);
		d.switchTo().frame(d.findElement(By.xpath("/html/body/section/div/div/iframe")));
		d.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("surya");
		

	}

}
