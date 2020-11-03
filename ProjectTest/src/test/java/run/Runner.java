package run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\features\\OpenSearch.feature", glue="stepDefinitions", monochrome=true)
public class Runner extends AbstractTestNGCucumberTests {

}
