package pom1_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class signInPage {
	WebDriver d;
	By name = By.id("user_full_name");
	By email = By.id("user_email_login");
	By password = By.id("user_password");
	By agree = By.id("tnc_checkbox");	
	By signMe = By.id("user_submit");

public signInPage(WebDriver d) {
	this.d = d;
}
public void typeName(String arg1) {
	d.findElement(name).sendKeys(arg1);
	
}
public void typeEmail(String arg1) {
	d.findElement(email).sendKeys(arg1);
	
}
public void typePassword(String arg1) {
	d.findElement(password).sendKeys(arg1);
	
}
public void clickAgree() {
	Actions act = new Actions(d);
	act.moveToElement(d.findElement(agree)).click().build().perform();
	//d.findElement(agree).click();
}
public void clickSignMe() {
	Actions act = new Actions(d);
	act.moveToElement(d.findElement(signMe)).click().build().perform();
	
}
}
