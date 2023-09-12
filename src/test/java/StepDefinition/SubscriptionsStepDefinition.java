package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SubscriptionPage;

public class SubscriptionsStepDefinition {
    SubscriptionPage subscriptionPage = new SubscriptionPage();

    @Given("user navigate to stc tv subscription page for {string}")
    public void userNavigateToStcTvSubscriptionPage(String country) {
        subscriptionPage.SelectNavigationUrl(country);
    }

    @When("subscription page loaded successfully for {string}")
    public void SubscriptionPageLoadedSuccessfully(String country) {
        Assert.assertEquals(country, subscriptionPage.GetCountryName());
    }

    @Then("verify subscription page")
    public void verifySubscriptionPage() {
        Assert.assertEquals("Choose Your Plan", subscriptionPage.GetSubscriptionPageTitle());
    }

    @Then("verify the package {string}")
    public void verifyThePackageTypes(String type) {
        Assert.assertEquals(type, subscriptionPage.GetPackageTypes());
    }


    @Then("verify {string} for each country")
    public void verifyCurrencyForEachCountry(String currency) {
        Assert.assertEquals(currency, subscriptionPage.GetCurrency());
    }

    @Then("verify package types for each country")
    public void verifyPackageTypesForEachCountry() {
        Assert.assertEquals("[lite, classic, premium]", subscriptionPage.GetPackageTypes());
    }
}