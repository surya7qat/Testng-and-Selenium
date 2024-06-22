package testClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunction.browserSetup;
import pageObject.adminPageObjects;
import pageObject.loginPageObjects;

public class adminPagePOM extends browserSetup {  
	static Logger logger = Logger.getLogger(adminPage.class);
	public static void login() throws IOException {
		propertiesConfiguartion();
		loginPageObjects.userName.sendKeys(prty.getProperty("userName"));
		loginPageObjects.password.sendKeys(prty.getProperty("password"));
		loginPageObjects.loginButton.click();
		logger.info("Login successfully");
		
	}
	public static void selectUserRoleAndStatus() throws AWTException {
		adminPageObjects.adminMoudle.click();
		Robot rbt = new Robot();
		adminPageObjects.adminUserRole.click();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		adminPageObjects.adminStatus.click();
		logger.info("Selected Admin status successfully");
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		adminPageObjects.adminSearch.click();
		logger.info("Selected Admin search successfully");
	}
	public static void printResultTable() {
		logger.info("Started taking webtable");
		logger.info("webtable");
		List<WebElement> list =adminPageObjects.adminResultTableColumn;
		for(int i=1;i<=5;i++) {
		WebElement userName = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div["+i+"]/div/div[2]"));
		System.out.println("User name = "+userName.getText());
		logger.info("User name = "+userName.getText());
		WebElement empName = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div["+i+"]/div/div[4]"));
		System.out.println("employee name ="+empName.getText());
		logger.info("employee name ="+empName.getText());
		}
		logger.info("Webtable finished");
		
	}
	@Test
	public static void getAdminRecord() throws IOException, AWTException {
		PageFactory.initElements(d, loginPageObjects.class);
		login();
		PageFactory.initElements(d, adminPageObjects.class);
		selectUserRoleAndStatus();
		printResultTable();
		printResultTable();
		
	}
	
	
	


}
