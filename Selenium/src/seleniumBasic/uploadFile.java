package seleniumBasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi.ECVKO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver d;
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.leafground.com/file.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		WebElement link = d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
		link.click();
		String file = "C:\\Users\\ADMIN\\Desktop\\a.png";
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		Thread.sleep(1000);
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("com");
		
		
		
		
		

	}

}
