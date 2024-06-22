package SELE_BASICS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DEMORUNN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--remote-allow-origins=*");
		//WebDriver d;
		//WebDriverManager.chromedriver().setup();
		//d=new ChromeDriver(opt);
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver(opt);
		
System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
d.get("https://in.bookmyshow.com/");

	}

}
