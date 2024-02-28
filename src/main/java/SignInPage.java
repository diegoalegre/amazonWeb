import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchInput;

    @FindBy(css = "#ap_email")
    private WebElement inputUser;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement inputPass;

    @FindBy(xpath = "//span[@id='continue']")
    private WebElement continueButton;

    @FindBy(css = "#signInSubmit")
    private WebElement continueButtonPass;


    public void loginUser() {
        inputUser.sendKeys("diegotest375@gmail.com");
        continueButton.click();
        inputPass.sendKeys("diegotest!375");
        continueButtonPass.click();
    }

}