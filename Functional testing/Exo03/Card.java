import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Card extends PageObject {
    @FindBy(css = ".val-col.total-row") private WebElement prix;
    public void compare(String price){
        Assert.assertEquals(prix.getText(),price);
    }
    public Card(WebDriver driver) {
        super(driver);
    }
}
