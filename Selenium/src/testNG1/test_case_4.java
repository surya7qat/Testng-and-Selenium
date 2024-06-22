package testNG1;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class test_case_4 {
	WebDriver d;
	
  

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Surya\\Selenium\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		WebElement name = d.findElement(By.id("txt_unam"));
		name.sendKeys("sylix");
		WebElement pwd = d.findElement(By.id("txt_pass"));
		pwd.sendKeys("admin");
		WebElement submit =d.findElement(By.id("Button3"));
		submit.click();
		d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[10]/a")).click();
		d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_Menu1\"]/ul/li[2]/a")).click();
		
  }
  
  
  @Test(priority = 01)
  public void bloodgroup() throws InterruptedException, BiffException, IOException {
	  FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Test case-4 (GUI_UI) (20.11.2023).xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet sh=wb.getSheet(0);

	  for(int i=1;i<=10;i++) {
		  String data = sh.getCell(	11, i).getContents();
		  String tcid = sh.getCell(	8, i).getContents();
		  String va = sh.getCell(9, i).getContents();
		  WebElement bg = d.findElement(By.id("ContentPlaceHolder1_txt_bg"));
		  bg.sendKeys(data);
		  System.out.println("Test condition id = "+tcid);
		  System.out.println("Test data = "+data);
		  Thread.sleep(5000);
		  WebElement save = d.findElement(By.id("ContentPlaceHolder1_Button2"));
		  save.click();
		  Boolean bo = save.equals(save);
		  String va1 = "Valid";
		  boolean ab =va.equals(va1);
		  if(ab == true) {
			  if(bo == true) {
				  System.out.println("Status is passed");
			  }
			   else if(bo == false) {
				  System.out.println("Status is failed");
			  }
			  else if(ab == false) {
				  if(bo == true) {
					  System.out.println("Status is failed");
				  }
				   else if(bo == false) {
					  System.out.println("Status is passed");
				  }
				  
			  }
			  System.out.println(" ");
		  }
	  }
		 
	  }
  @Test(priority = 02)
  public void yearOfExperience() throws InterruptedException, BiffException, IOException {
	  FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Test case-4 (GUI_UI) (20.11.2023).xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet sh=wb.getSheet(0);

	  for(int i=11;i<=18;i++) {
		  String data = sh.getCell(	11, i).getContents();
		  String tcid = sh.getCell(	8, i).getContents();
		  String va = sh.getCell(9, i).getContents();
		  WebElement bg = d.findElement(By.id("ContentPlaceHolder1_txt_bg"));
		  bg.sendKeys(data);
		  System.out.println("Test condition id = "+tcid);
		  System.out.println("Test data = "+data);
		  Thread.sleep(5000);
		  WebElement save = d.findElement(By.id("ContentPlaceHolder1_Button2"));
		  save.click();
		  Boolean bo = save.equals(save);
		  String va1 = "Valid";
		  boolean ab =va.equals(va1);
		  if(ab == true) {
			  if(bo == true) {
				  System.out.println("Status is passed");
			  }
			   else if(bo == false) {
				  System.out.println("Status is failed");
			  }
			  else if(ab == false) {
				  if(bo == true) {
					  System.out.println("Status is failed");
				  }
				   else if(bo == false) {
					  System.out.println("Status is passed");
				  }
				  
			  }
			  System.out.println(" ");
		  }}
	  }
  @Test(priority = 03)
  public void companyName() throws InterruptedException, BiffException, IOException {
	  FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Test case-4 (GUI_UI) (20.11.2023).xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet sh=wb.getSheet(0);

	  for(int i=19;i<=25;i++) {
		  String data = sh.getCell(	11, i).getContents();
		  String tcid = sh.getCell(	8, i).getContents();
		  String va = sh.getCell(9, i).getContents();
		  WebElement bg = d.findElement(By.id("ContentPlaceHolder1_txt_bg"));
		  bg.sendKeys(data);
		  System.out.println("Test condition id = "+tcid);
		  System.out.println("Test data = "+data);
		  Thread.sleep(5000);
		  WebElement save = d.findElement(By.id("ContentPlaceHolder1_Button2"));
		  save.click();
		  Boolean bo = save.equals(save);
		  String va1 = "Valid";
		  boolean ab =va.equals(va1);
		  if(ab == true) {
			  if(bo == true) {
				  System.out.println("Status is passed");
			  }
			   else if(bo == false) {
				  System.out.println("Status is failed");
			  }
			  else if(ab == false) {
				  if(bo == true) {
					  System.out.println("Status is failed");
				  }
				   else if(bo == false) {
					  System.out.println("Status is passed");
				  }
				  
			  }
			  System.out.println(" ");
		  }}
	  }
		 
  @Test(priority = 04)
  public void fixedPay() throws InterruptedException, BiffException, IOException {
	  FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Test case-4 (GUI_UI) (20.11.2023).xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet sh=wb.getSheet(0);

	  for(int i=26;i<=31;i++) {
		  String data = sh.getCell(	11, i).getContents();
		  String tcid = sh.getCell(	8, i).getContents();
		  String va = sh.getCell(9, i).getContents();
		  WebElement bg = d.findElement(By.id("ContentPlaceHolder1_txt_bg"));
		  bg.sendKeys(data);
		  System.out.println("Test condition id = "+tcid);
		  System.out.println("Test data = "+data);
		  Thread.sleep(5000);
		  WebElement save = d.findElement(By.id("ContentPlaceHolder1_Button2"));
		  save.click();
		  Boolean bo = save.equals(save);
		  String va1 = "Valid";
		  boolean ab =va.equals(va1);
		  if(ab == true) {
			  if(bo == true) {
				  System.out.println("Status is passed");
			  }
			   else if(bo == false) {
				  System.out.println("Status is failed");
			  }
			  else if(ab == false) {
				  if(bo == true) {
					  System.out.println("Status is failed");
				  }
				   else if(bo == false) {
					  System.out.println("Status is passed");
				  }
				  
			  }
			  System.out.println(" ");
		  }}
	  }

  
	  
  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
