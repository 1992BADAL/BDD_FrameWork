package TestRunner;

import org.junit.runner.RunWith;

//import io.cucumber.testng.CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions( 
		features = ".//Features/Customer.feature",
		glue = "StepDefinition",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports/reports1.html",
				"json:target/cucumber-reports/reports2.json",
				"junit:target/cucumber-reports/reports3.xml"}
)
//public class Run extends AbstractTestNGCucumberTests{
/*Class will be empty*/
//}
public class Run{
	
}