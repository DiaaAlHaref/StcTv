package pages;

import org.openqa.selenium.By;
import utilities.UiActions;

import java.util.Arrays;

public class SubscriptionPage {
    String[] packageTypes = new String[]{"lite", "classic", "premium"};

    public void SelectCountryUrl(String country) {
        switch (country) {
            case "KSA":
                UiActions.driver.navigate().to("https://subscribe.stctv.com/sa-en");
                break;
            case "Bahrain":
                UiActions.driver.navigate().to("https://subscribe.stctv.com/bh-en");
                break;
            case "Kuwait":
                UiActions.driver.navigate().to("https://subscribe.stctv.com/kw-en");
                break;
            default:
                System.out.println("Can not reach the navigation url");
        }
        UiActions.driver.manage().window().maximize();
    }

    public void SelectNavigationUrl(String country) {
        SelectCountryUrl(country);
    }

    public String GetCountryName() {
        return UiActions.getTextFromElement(By.id("country-btn"));
    }

    public String GetSubscriptionPageTitle() {
        return UiActions.getTextFromElement(By.xpath("//h2[@class='mobile-hidden' and contains(.,'Choose Your Plan')]"));
    }

    public String GetPackageTypes() {
        for (String type : packageTypes
        ) {
            UiActions.getTextFromElement(By.id("name-" + type));
        }
        return Arrays.toString(packageTypes);
    }

    public String GetCurrency() {
        String price = UiActions.getTextFromElement(By.id("currency-lite"));
        return extractCurrencyFromPrice(price);
    }

    public static String extractCurrencyFromPrice(String price) {
        int spaceIndex = price.indexOf("/");
        String[] currency = price.substring(0, spaceIndex).split(" ", 2);
        return currency[1];
    }
}