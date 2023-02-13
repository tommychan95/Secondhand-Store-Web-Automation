import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "Include/features",
glue = "stepDefinition",
tags = "",
monochrome = true
)

public class Runner {
}