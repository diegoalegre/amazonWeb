import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    private WebElement accountBox;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    private WebElement accountButton;

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchInput;

    @FindBy(css = "#ap_email")
    private WebElement inputUser;

    @FindBy(css = "#ap_password")
    private WebElement inputPass;

    @FindBy(xpath = "//li[@aria-setsize='12']")
    private List<WebElement> bestSellerKitchen;

    public void login() {
    accountButton.click();
    }


    public String getAccountBox(){
        return accountBox.getText();
    }

    public boolean isNameDisplayed(){
        return accountBox.getText().contains("Diego");
    }

    public void carouselItemsKitchen(){
        bestSellerKitchen.get(2).click();
    }

}