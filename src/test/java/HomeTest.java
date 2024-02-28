import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class HomeTest extends BaseTest {
    @Test
    public void openBrowser() throws InterruptedException {
        home.login();
        signin.loginUser();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")));
        Assert.assertTrue(home.isNameDisplayed());
    }

    @Test
    public void homePage() throws InterruptedException {
        home.login();
        signin.loginUser();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")));
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.amazon.com/?ref_=nav_ya_signin");
    }


    @Test
    public void carousel(){
        home.carouselItemsKitchen();
        Assert.assertEquals(productPage.getSymbol(),"US$");
    }

    @Test
    public void detailProduct(){
        home.carouselItemsKitchen();
        SoftAssert softAssert = new SoftAssert();
        //softAssert.assertEquals(productPage.getDescription(),"Product information");
        softAssert.assertEquals(productPage.getDescription(),"Información de producto");
    }
}