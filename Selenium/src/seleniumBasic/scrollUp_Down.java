package seleniumBasic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollUp_Down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver(opt);
System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
d.get("https://www.google.co.in/search?q=neymar&sca_esv=584304970&sxsrf=AM9HkKlSn2zmUKaqewsObxcYVtbEmX1n9g%3A1700579359841&ei=H8hcZfHgMrqUseMPpfmqyA4&ved=0ahUKEwix7J7lr9WCAxU6SmwGHaW8CukQ4dUDCBA&uact=5&oq=neymar&gs_lp=Egxnd3Mtd2l6LXNlcnAiBm5leW1hcjIKEC4YgAQYigUYJzIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzINEAAYgAQYigUYsQMYQzIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzIIEC4YsQMYgAQyChAAGIAEGIoFGEMyBRAAGIAEMiYQLhiABBiKBRiXBRjcBBjeBBjgBBj0AxjxAxj1Axj2Axj3A9gBA0iLFlC3AlizEnACeAGQAQGYAbwBoAHQBaoBAzIuNLgBA8gBAPgBAcICChAAGEcY1gQYsAPCAg0QABiABBiKBRiwAxhDwgINEC4YgAQYigUYsAMYQ8ICDhAAGOQCGNYEGLAD2AEBwgITEC4YgAQYigUYyAMYsAMYQ9gBAsICCBAAGIAEGLEDwgIKEAAYgAQYFBiHAsICJhAuGIAEGIoFGJcFGNwEGN4EGOAEGPQDGPEDGPUDGPYDGPcD2AED4gMEGAAgQYgGAZAGE7oGBggBEAEYCboGBggCEAEYCLoGBggDEAEYFA&sclient=gws-wiz-serp");
Thread.sleep(5000);
d.manage().window().maximize();
 Thread.sleep(6000);
 ((JavascriptExecutor)d).executeScript("window.scrollBy(0,6000)");
JavascriptExecutor js=(JavascriptExecutor)d;
js.executeScript("window.scrollBy(0,6000)");
Thread.sleep(6000);
((JavascriptExecutor)d).executeScript("window.scrollBy(0,-6000)");
	}

}
