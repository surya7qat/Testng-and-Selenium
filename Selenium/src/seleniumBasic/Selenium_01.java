package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver d= new ChromeDriver();
		d.get("https://www.techlistic.com/p/selenium-practice-form.html");
		WebElement firstname = d.findElement(By.name("firstname"));
		firstname.sendKeys("Surya");
		WebElement lastname = d.findElement(By.name("lastname"));
		lastname.sendKeys("Krishna Murthi");
		WebElement gender = d.findElement(By.xpath("//*[@id=\"sex-0\"]"));
		gender.click();
		try {WebElement experience = d.findElement(By.id("exp-3"));
		experience.click();}
		finally {
		WebElement date = d.findElement(By.id("datepicker"));
		date.sendKeys("14/10/2000");
		try {WebElement profession = d.findElement(By.id("profession-1"));
		profession.click();}
		finally {
		try {WebElement tool = d.findElement(By.id("tool-2"));
		tool.click();}
		finally {
		WebElement continent = d.findElement(By.id("continents"));
		continent.click();
		WebElement europe = d.findElement(By.xpath("//*[@id=\"continents\"]/option[2]"));
		europe.click();
		WebElement command = d.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[4]"));
		command.click();
		WebElement upload = d.findElement(By.xpath("//*[@id=\"photo\"]"));
		upload.sendKeys("C:\\Users\\ADMIN\\Desktop\\photo.jpg");}}}
		WebElement submit = d.findElement(By.xpath("//*[@id=\"submit\"]"));
		boolean a = submit.isEnabled();
		System.out.println(a);
		submit.click();
		
		
		
		

	}

}
