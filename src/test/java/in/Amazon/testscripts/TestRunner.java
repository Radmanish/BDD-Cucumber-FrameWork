package in.Amazon.testscripts;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Features"

		      , glue = "in.Amazon.testscripts"
                     )
public class TestRunner extends AbstractTestNGCucumberTests {

}
