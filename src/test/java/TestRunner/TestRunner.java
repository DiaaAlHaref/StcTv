package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"StepDefinition"},
        monochrome = true,
        plugin = {"pretty",
                "json:target/cucumber-reports/Subscription.json",
                "html:target/cucumber-reports/Subscription.html"})

public class TestRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = false)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

