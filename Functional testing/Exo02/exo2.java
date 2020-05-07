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

public class exo2 {
    static WebDriver driver;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        System.setProperty("webdriver.chrome.driver","C://Users//BOS//Desktop//sil2//selinium//Chrome WebDriver//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void test() {

        driver.get("https://www.ebay.com");
        WebElement inputSearch = driver.findElement(By.id("gh-ac"));
        inputSearch.sendKeys("shoes for men");
        inputSearch.submit();

        driver.findElement(By.linkText("New Men's Salomon Speedcross 4 Athletic Running Sports Outdoor Hiking Shoes #3")).click();
        Select sel = new Select(driver.findElement(By.id("msku-sel-1")));
        sel.selectByValue("2");
        driver.findElement(By.id("qtyTextBox")).clear();
        driver.findElement(By.id("qtyTextBox")).sendKeys("2");
        driver.findElement(By.id("isCartBtn_btn")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".val-col.total-row")).getText(),"US $25.18");
    }
}