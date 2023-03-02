package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/FeatureFile",glue = "StepDefination",
plugin = {"pretty","json:target/cucumber.json"}
)
public class TestRun extends AbstractTestNGCucumberTests{

}
