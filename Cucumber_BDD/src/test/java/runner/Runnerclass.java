package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber_BDD\\src\\test\\java\\featureFile"},
		glue= {"stepdefinition"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty", "html:reports\\login.html."}
		)
public class Runnerclass extends AbstractTestNGCucumberTests  {

}
