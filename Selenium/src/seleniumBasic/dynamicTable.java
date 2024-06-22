package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d= new ChromeDriver();
		d.get("https://www.leafground.com/table.xhtml");
		List<WebElement> column = d.findElements(By.xpath("//div[@class='ui-widget-header ui-datatable-scrollable-header']/div/table/thead/tr/th"));
		List<WebElement> row = d.findElements(By.xpath("//tbody[@id='form:j_idt89_data']/tr"));
		System.out.println("column "+column.size());
		System.out.println("row "+row.size());
		WebElement a = d.findElement(By.xpath("//td[normalize-space(text())='Izzy Rodrigues']/following::td[1]"));
		System.out.println(a.getText());
		
		
		
		
		

	}

}
