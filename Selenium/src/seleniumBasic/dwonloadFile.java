package seleniumBasic;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dwonloadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.leafground.com/file.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		d.findElement(By.xpath("//span[text()=\"Download\"]")).click();
		File file = new File("C:\\Users\\ADMIN\\Downloads");
		File[] totalfile = file.listFiles();
		for(File searchlist : totalfile) {
			System.out.println(searchlist.getName());
			if(searchlist.getName().equals("TestLeaf Logo.png")) {
			System.out.println("file is downloaded");
			break;}
		}
		

	}

}
