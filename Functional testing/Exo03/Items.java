import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Items extends PageObject {

public void enterItem(String item){
    driver.findElement(By.linkText(item)).click();
}
    public Items(WebDriver driver) {
        super(driver);
    }
}
