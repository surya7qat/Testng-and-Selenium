package seleniumBasic;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class dataDriven {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.google.com");
		WebElement search = d.findElement(By.id("APjFqb"));
		FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\MobileBrand.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet s=wb.getSheet(0);
		int row = s.getRows();
		int column =s.getColumns();
		System.out.println(row+" "+column);
		for (int j = 0; j<column;j++) {
		for(int i = 1;i<row;i++) {
			String product = s.getCell(j, i).getContents();
			String product1 = s.getCell(j, 0).getContents();
			search.sendKeys(product+" "+product1+Keys.ENTER);
			//Thread.sleep(5000);
			d.navigate().back();
			System.out.println(product+" "+product1);
		}
		
		System.out.println(j+" cycle finish");
		System.out.println(" ");
		}
		
		
		
		
		

	}

}
