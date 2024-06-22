package workout;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseclass.chromeOpento;

public class screenShot extends chromeOpento {
  @Test
  public void f() throws IOException {
	 File fl = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(fl, new File("C:\\\\Users\\\\ADMIN\\\\Desktop\\\\shot1.png"));
  }
}
