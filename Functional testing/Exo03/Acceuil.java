import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Acceuil extends PageObject {
    @FindBy(id="gh-ac") private WebElement searchItem;
    public void enterValues(String itemToSearch){
        this.searchItem.sendKeys(itemToSearch);
         }
         public void search() {
             searchItem.submit();
    }
    public Acceuil(WebDriver driver) {
        super(driver);
    }
}
