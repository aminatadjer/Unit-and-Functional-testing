import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Item extends PageObject {
    @FindBy(id="msku-sel-1") private WebElement shoesSize;
    @FindBy(id="qtyTextBox") private WebElement shoesQuantity;
    @FindBy(id="isCartBtn_btn") private WebElement buttonCard;
    public void caracteristiques(String taille, String qty){
        Select sel=new Select(shoesSize);
        sel.selectByValue(taille);
        shoesQuantity.clear();
        shoesQuantity.sendKeys(qty);
    }
    public void addToCard(){
        buttonCard.click();
    }
    public Item(WebDriver driver) {
        super(driver);
    }
}
