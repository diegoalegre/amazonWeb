import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    private final String BASE_URL = "https://www.amazon.com/";

    WebDriver driver = new ChromeDriver();
    protected HomePage home;
    protected SignInPage signin;
    protected SignInPage signinpass;
    protected ProductPage productPage;


    @BeforeTest
    public void SetUp() {
        driver.get(BASE_URL);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        home= PageFactory.initElements(driver, HomePage.class);
        signin = PageFactory.initElements(driver, SignInPage.class);
        signinpass = PageFactory.initElements(driver, SignInPage.class);
        productPage = PageFactory.initElements(driver,ProductPage.class);
    }

    @AfterTest
    public void close(){
        driver.quit();
    }
}

