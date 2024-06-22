package Workout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.setProperty("webDriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\Desktop\\\\Surya\\\\Selenium\\\\Driver\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
     WebDriver d = new ChromeDriver();
     d.manage().window().maximize();
     d.get("https://demo.guru99.com/test/web-table-element.php");
   //*[@id="leftcontainer"]/table/tbody/tr/td[1]
   //*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
   //*[@id="leftcontainer"]/table/tbody/tr[2]/td[1]
   //*[@id="leftcontainer"]/table/tbody/tr[3]/td[1]
     List<WebElement> columnlist = d.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
    int column = columnlist.size();
    System.out.println("column "+column);
    ArrayList<String> list = new ArrayList<String>();
    for(int i=1;i<=column;i++)
    {
    	WebElement ab = d.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]"));
    	System.out.println(ab.getText());
    	String abc = ab.getText();
    	
    	list.add(abc);
    }
	for (String list1:list)
    {
    	System.out.println(list1);
    }
    d.quit();
	}

}
