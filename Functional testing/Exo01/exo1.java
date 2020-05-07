import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class exo1 {
    static WebDriver driver;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        System.setProperty("webdriver.chrome.driver","C://Users//BOS//Desktop//sil2//selinium//Chrome WebDriver//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void test() {

        driver.get("https://www.ebay.com");
        WebElement shopCategory = driver.findElement(By.id("gh-shop-a"));
        shopCategory.click();
        driver.findElement(By.linkText("Kids toys")).click();
        driver.findElement(By.linkText("Action")).click();
        driver.findElement(By.linkText("Car")).click();
        driver.findElement(By.linkText("Cast Iron")).click();
        List<WebElement> list= driver.findElements(By.className("s-item   "));
        Assert.assertEquals(list.size(),6);

    }
}