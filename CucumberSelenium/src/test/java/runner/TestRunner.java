package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",glue = "stepdef",dryRun=false,monochrome=true,plugin={"pretty","html:target/index.html","json:target/cucumber.json"},tags="@tag")
public class TestRunner {

}
