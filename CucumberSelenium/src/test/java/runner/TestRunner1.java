package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/Registration.feature",glue="stepdef",dryRun=false,
monochrome=true,plugin={"pretty","html:target/index.html","json:target/cucumber.json"})
public class TestRunner1 {

	
	
	
	
}
