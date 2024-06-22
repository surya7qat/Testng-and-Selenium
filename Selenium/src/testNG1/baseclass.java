package testNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseClass.chromeOpen;

public class baseclass extends chromeOpen {
  @Test
  public void f() throws InterruptedException {
	  Actions a = new Actions(d);
      WebElement toolTip1 = d.findElement(By.xpath("/html/body/div[1]"));
      a.moveToElement(toolTip1).build().perform();
      toolTip1.click();
      Thread.sleep(6000);
  }
}
