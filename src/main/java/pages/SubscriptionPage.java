package pages;

import org.openqa.selenium.By;
import utilities.UiActions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class SubscriptionPage {

    public static Properties prop = new Properties();
    String[] packageTypes = new String[]{"lite", "classic", "premium"};
    By countryButtonLocator = By.id("country-btn");
    By subscriptionPageTitleLocator = By.xpath("//h2[@class='mobile-hidden' and contains(.,'Choose Your Plan')]");
    By currencyLocator = By.id("currency-lite");
    public void SelectCountryUrl(String country) throws IOException {
        FileReader file = new FileReader(System.getProperty("user.dir")+"\\config\\config.properties");
        prop.load(file);
        switch (country) {
            case "KSA":
                UiActions.driver.navigate().to(prop.getProperty("KSA"));
                break;
            case "Bahrain":
                UiActions.driver.navigate().to(prop.getProperty("BAHRAIN"));
                break;
            case "Kuwait":
                UiActions.driver.navigate().to(prop.getProperty("Kuwait"));
                break;
            default:
                System.out.println("Can not reach the navigation url");
        }
        UiActions.driver.manage().window().maximize();
    }

    public void SelectNavigationUrl(String country) throws IOException {
        SelectCountryUrl(country);
    }

    public String GetCountryName() {
        return UiActions.getTextFromElement(countryButtonLocator);
    }

    public String GetSubscriptionPageTitle() {
        return UiActions.getTextFromElement(subscriptionPageTitleLocator);
    }

    public String GetPackageTypes() {
        for (String type : packageTypes
        ) {
            UiActions.getTextFromElement(By.id("name-" + type));
        }
        return Arrays.toString(packageTypes);
    }

    public String GetCurrency() {
        String price = UiActions.getTextFromElement(currencyLocator);
        return extractCurrencyFromPrice(price);
    }

    public static String extractCurrencyFromPrice(String price) {
        int spaceIndex = price.indexOf("/");
        String[] currency = price.substring(0, spaceIndex).split(" ", 2);
        return currency[1];
    }
}