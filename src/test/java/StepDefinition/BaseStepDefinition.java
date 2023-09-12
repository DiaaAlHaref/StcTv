package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.UiActions;
import utilities.WebDriverFactory;

public class BaseStepDefinition {
    UiActions uiActions = new UiActions();

    @Before
    public void setUp() {
        String browser = System.getProperty("browser");
        if (browser != null) {
            switch (browser) {
                case "chrome":
                    uiActions.driver = WebDriverFactory.createChromeDriver();
                    break;
                case "firefox":
                    uiActions.driver = WebDriverFactory.createFirefoxDriver();
                    break;
                case "edge":
                    uiActions.driver = WebDriverFactory.createEdgeDriver();
                    break;
            }
        } else {
            System.out.println(" Browser variable is null");
        }

    }

    @After
    public void closeTheBrowser() {
        uiActions.driver.close();
    }
}