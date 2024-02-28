import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    @FindBy(xpath = "//div[@id='corePrice_feature_div']/descendant::span[@class='a-price-symbol']")
    private WebElement priceSymbol;

    @FindBy(xpath = "//h2[contains(text(),'eta')]")
    private WebElement description;

    public String getSymbol(){
        return priceSymbol.getText();
    }

    public String getDescription(){
        return description.getText();
    }
}
