package testPaper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2023_11_14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-origins-allow=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver(opt);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		d.get("https://qavalidation.com/demo-form/");
		d.findElement(By.id("g4072-fullname")).sendKeys("Surya Krishna murthy");
		d.findElement(By.id("g4072-email")).sendKeys("surya141057@gmail.com");
		d.findElement(By.id	("g4072-phonenumber")).sendKeys("8838931791");
		WebElement gender = d.findElement(By.cssSelector("select#g4072-gender"));
//		gender.click();
//		d.findElement(By.id("ui-id-1")).click();
		Select selGender = new Select(gender);
		selGender.selectByIndex(1);
		d.findElement(By.cssSelector("input[value ='2']")).click();
		d.findElement(By.cssSelector("input[value ='Functional testing']")).click();
		d.findElement(By.cssSelector("input[value ='Automation testing']")).click();
		d.findElement(By.cssSelector("input[value ='DB testing']")).click();
		WebElement tool = d.findElement(By.id("g4072-qatools"));
		Select selTool = new Select(tool);
		selTool.selectByVisibleText("Selenium");
		d.findElement(By.xpath("//*[@id=\"contact-form-comment-g4072-otherdetails\"]")).sendKeys("Test completed");
		d.findElement(By.xpath("//*[@id=\"contact-form-4072\"]/form/div[9]/button")).click();
		}
		
	}
