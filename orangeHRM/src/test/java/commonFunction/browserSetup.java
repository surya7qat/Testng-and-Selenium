package commonFunction;

import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class browserSetup {
	protected static WebDriver d;
	protected static Properties prty;
	static Logger logger = Logger.getLogger(browserSetup.class);
	
	
	
	public static Properties propertiesConfiguartion() throws IOException {
		FileInputStream input = new FileInputStream("config.properties");
		prty = new Properties();
		prty.load(input);
		return prty;

	}
	@BeforeSuite
	public void beforeSuite() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		propertiesConfiguartion();
		String browser =prty.getProperty("browser");
		String browserLocation =prty.getProperty("browserLocation");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("chromeDriver.chrome.driver", browserLocation);
			logger.info("Chrome browser starting");
			d = new ChromeDriver();
			d.get(prty.getProperty("url"));
			d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("geckoDriver.chrome.driver", browserLocation);
			logger.info("FireFox browser starting");
			d = new FirefoxDriver();
			d.get(prty.getProperty("url"));
			d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		else {
			System.out.println("unknown browser select firefox/chrome");
			logger.info("Invalid chrome browser name typed");
		}

	}

	@AfterSuite
	public void afterSuite() {
		logger.info("Browser closed");
		d.close();
	}

}
