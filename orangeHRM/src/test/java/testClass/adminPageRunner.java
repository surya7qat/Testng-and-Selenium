package testClass;


import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(
		features = "adminPage.feature",
		glue="testClass",
		monochrome = true,
		dryRun = true
		)

public class adminPageRunner extends AbstractTestNGCucumberTests{
}
