package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"StepDefinition"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports/CucumberTestReport.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = false)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

