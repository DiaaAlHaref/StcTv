package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.internal.Configuration;


@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        features = "src/test/java/features",
        glue = {"StepDefinition"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports"})

public class TestRunner {


}

