package pom1_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	WebDriver d;
	By header = By.xpath("//*[@id=\"product-text-section\"]/h1");
	By getStart = By.xpath("//*[@id=\"signupModalProductButton\"]");
	
	public homePage(WebDriver d) {
		this.d=d;
	}
	public void getTextHeader() {
		String getTextHeader = d.findElement(header).getText();
		System.out.println(getTextHeader);
	}
	public void clickOnGetStarted()
	{
		d.findElement(getStart).click();
	}
}
