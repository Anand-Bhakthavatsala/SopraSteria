package myRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//java//feature//GoogleSearch.feature",
		glue= {"stepDef"},monochrome = true, plugin = {"pretty","html:target/HTML_Reports"}
		)

public class GoogleRunner {

}
