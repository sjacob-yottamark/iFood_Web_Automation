package iFood_Web_Automation.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions (
		//features = {"src/test/java/iFood_Web_Automation/FeatureFiles/"},
		features = {"src/test/java/iFood_Web_Automation/FeatureFiles/"},
		glue = {"iFood_Web_Automation.Steps"},
		monochrome = true,
		dryRun = false,
		//dryRun = true,
		//tags = {"@English_review,@English_report,@English_data"},
		//tags = {"@English_new,@English_analytics,@English_documents"},
		tags = {"@English_new"},
		//tags = {"@English_review"},
		//tags = {"@English_report"},
		//tags = {"@English_data"},
		//tags = {"@English_new,@English_review"},
		//tags = {},
		plugin = {"pretty", 
				  "html:output/cucumber",
				  "json:output/cucumber.json", 
				  "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
		)

public class MainRunner extends AbstractTestNGCucumberTests {
	
}
