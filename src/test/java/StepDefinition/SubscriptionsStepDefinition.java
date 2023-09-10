package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubscriptionsStepDefinition {
    public WebDriver driver;
    @Given("user navigate to stc tv subscription page")
    public void userNavigateToStcTvSubscriptionPage(){
        driver = new ChromeDriver();
        driver.navigate().to("https://subscribe.stctv.com/bh-en");
        driver.manage().window().maximize();
    }

    @When("subscription page loaded successfully")
    public void SubscriptionPageLoadedSuccessfully(){

    }

    @Then("verify subscription page")
    public void verifySubscriptionPage(){
        String MonthlyPrice = driver.findElement(By.id("currency-lite")).getText();
        Assert.assertEquals("2 BHD/month", MonthlyPrice);
    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }
}
