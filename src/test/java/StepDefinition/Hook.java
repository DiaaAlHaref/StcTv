package StepDefinition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.UiActions;
import utilities.WebDriverFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Hook  {
    Properties prop = new Properties();


    @Before
    public void setUp() throws IOException {
        FileReader file = new FileReader(System.getProperty("user.dir") + "\\config\\config.properties");
        prop.load(file);
        String browser= prop.getProperty("browser");
        if (browser != null) {
            switch (browser) {
                case "chrome":
                    UiActions.driver = WebDriverFactory.createChromeDriver();
                    break;
                case "firefox":
                    UiActions.driver = WebDriverFactory.createFirefoxDriver();
                    break;
                case "edge":
                    UiActions.driver = WebDriverFactory.createEdgeDriver();
                    break;
            }
        } else {
            System.out.println(" Browser variable is null");
        }
    }

    @After
    public void closeTheBrowser() {
        UiActions.driver.close();
    }
}