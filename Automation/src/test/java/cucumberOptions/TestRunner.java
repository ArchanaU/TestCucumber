package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/features/search.feature",
glue = "stepDefinitions.Steps",
plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber.json","junit:target/cucumber.xml"},
monochrome=true,
strict=true)

public class TestRunner{

}