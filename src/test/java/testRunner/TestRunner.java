package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",glue={"definitionSteps"}
		, plugin = {
		        "pretty:target/prettyReport.txt", "html:target/cucumber", "json:target/cucumber.json",
		        "junit:target/junit-report.xml" }, monochrome = true
		, tags = "not @Ignore"
		)
public class TestRunner {

}
