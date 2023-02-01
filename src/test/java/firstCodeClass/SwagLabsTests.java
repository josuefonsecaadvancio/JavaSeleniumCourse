package firstCodeClass;

import firstCodeClass.PO.ButtonsPagePo;
import firstCodeClass.PO.LoginPo;
import firstCodeClass.PO.ProductsPo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SwagLabsTests {
    private WebDriver driver;
    //Declaring an instance of buttonsPagePo, so that we can use its methods
    LoginPo loginPo;
    ProductsPo productsPo;


    DriverClass driverClass = new DriverClass();


    @Before
    public void iniDriver() {
        driverClass.initDriver();
        driver = driverClass.getDriver();
        loginPo = new LoginPo(driver);
        productsPo = new ProductsPo(driver);
    }
    @Test
    public void login() {
        driver.get("https://www.saucedemo.com/");
        loginPo.fillUserName("standard_user");
        loginPo.fillPassword("secret_sauce");
        loginPo.clickLoginButton();
    }

    @Test
    public void checkFirstHeader(){
        login();
        productsPo.checkTextFirstItem("Sauce Labs Backpack");
    }

    @Test
    public void clickBurger(){
        login();
        productsPo.clickBurgerButton();
        productsPo.clickAllItems();
    }

    @After
    public void closeBrowser() {
        driverClass.quitBrowser();
    }

}
