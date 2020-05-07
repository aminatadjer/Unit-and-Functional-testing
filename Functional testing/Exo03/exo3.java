import javafx.beans.value.ObservableObjectValue;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exo3 {
    static WebDriver driver;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        System.setProperty("webdriver.chrome.driver","C://Users//BOS//Desktop//sil2//selinium//Chrome WebDriver//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com");


    }

     @Test
     public void Test() {
         Acceuil acceuil = new Acceuil(driver);
         acceuil.enterValues("shoes for men");
         acceuil.search();
         Items items = new Items(driver);
         items.enterItem("New Men's Salomon Speedcross 4 Athletic Running Sports Outdoor Hiking Shoes #3");
         Item item = new Item(driver);
         item.caracteristiques("2","2");
         item.addToCard();
         Card card = new Card(driver);
         card.compare("US $25.18");
     }

}
