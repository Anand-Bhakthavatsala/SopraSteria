package myRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//java//feature//tester.feature",
		glue= {"stepDef"},monochrome = false,dryRun=true, plugin = {"pretty"}
		)

public class testRunner {


}
