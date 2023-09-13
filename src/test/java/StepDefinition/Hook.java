package StepDefinition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utilities.UiActions;
import utilities.WebDriverFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hook  {
    Properties prop = new Properties();

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) throws IOException {
//        FileReader file = new FileReader(System.getProperty("user.dir") + "\\config\\config.properties");
//        prop.load(file);
//        String browser= prop.getProperty("browser");
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


    @AfterTest
    public void closeTheBrowser() {
        UiActions.driver.close();
    }
}