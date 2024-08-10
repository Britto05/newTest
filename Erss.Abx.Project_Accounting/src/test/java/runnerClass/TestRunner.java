package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/projectIndexMenu.feature",
		//features="src/test/resources/features/AllReportLinks.feature",
		//features="src/test/resources/features/Purchase.feature",
		glue={"stepDefinitions","hooks"}, 
		snippets = SnippetType.CAMELCASE,
		//tags="@Tag",

		dryRun = !true,
		monochrome = true,

		plugin = {"rerun:target/failed_scenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/cucumber-reports/report.html"}

		)
public class TestRunner {

}
