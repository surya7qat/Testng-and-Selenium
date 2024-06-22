package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.google.co.in/search?q=broken+image&sca_esv=f917e2823a31333e&hl=en&authuser=0&biw=1396&bih=632&udm=2&sxsrf=ACQVn09_2CUZ44jTLY0-b1b6FMnivvvGQQ%3A1707817112297&ei=mDjLZY_gEZ2fseMPr9ulqAM&ved=0ahUKEwiPjMfCgqiEAxWdT2wGHa9tCTUQ4dUDCBA&uact=5&oq=broken+image&gs_lp=Egxnd3Mtd2l6LXNlcnAiDGJyb2tlbiBpbWFnZUijAVAAWABwAHgAkAEAmAEAoAEAqgEAuAEDyAEA-AEB4gMEGAAgQQ&sclient=gws-wiz-serp");
		d.findElement(By.xpath("//*[@id=\"yDmH0d\"]")).click();
		// check whether the image is broken or not
		WebElement isbroken = d.findElement(By.xpath("//*[@id=\"islrg\"]/div[1]/div[2]/a[1]/div[1]/img"));
		if(isbroken.getAttribute("width").equals("0")) {
			System.out.println("It is broken image");
		}
		else {
			System.out.println("It is not broken image");
		}
		

	}

}
