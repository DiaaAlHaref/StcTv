import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testone {
    public WebDriver driver;

    @BeforeTest
    public void Setup(){
        driver = new ChromeDriver();
        driver.navigate().to("https://subscribe.stctv.com/bh-en");
        driver.manage().window().maximize();
    }
    @Test
    public void Test01(){
        // Country Locator
        driver.findElement(By.id("country-btn")).click();

        // Choose County Locator
        //driver.findElement(By.id("bh-contry-lable"));

        String MonthlyPrice = driver.findElement(By.id("currency-lite")).getText();
        Assert.assertEquals("2 BHD/month", MonthlyPrice);
    }

    @AfterTest
    public void TearDown(){
        driver.close();
    }
}
