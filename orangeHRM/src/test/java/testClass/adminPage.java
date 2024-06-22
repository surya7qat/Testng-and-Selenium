package testClass;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import commonFunction.browserSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPageObjects;

public class adminPage extends browserSetup {
	static Logger logger = Logger.getLogger(adminPage.class);
	public static void loginEnter() throws IOException {
		propertiesConfiguartion();
		loginPageObjects.userName.sendKeys(prty.getProperty("userName"));
		loginPageObjects.password.sendKeys(prty.getProperty("password"));
		logger.info("Login Cerdentials Enter");
	}
	public static void loginSubmit() throws IOException {
		propertiesConfiguartion();
		loginPageObjects.loginButton.click();
		logger.info("Login successfully");
	}
	@Given("Admin is in login page")
	public void admin_is_in_login_page() throws IOException {
		beforeSuite();
	}

	@When("Admin enter the username and password")
	public void admin_enter_the_username_and_password() throws IOException {
		PageFactory.initElements(d, loginPageObjects.class);
		loginEnter();
	}

	@When("Admin click the submit button")
	public void admin_click_the_submit_button() throws IOException {
		PageFactory.initElements(d, loginPageObjects.class);
		loginSubmit();
	}

	@Then("Admin goes to Home page")
	public void admin_goes_to_home_page() throws InterruptedException {
	   Thread.sleep(5000);
	   System.out.println("logging out");
	   afterSuite();
	}

}
