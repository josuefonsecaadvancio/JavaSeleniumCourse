package firstCodeClass;

import firstCodeClass.PO.ButtonsPagePo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class Tests {
    private WebDriver driver;
    //Declaring an instance of buttonsPagePo, so that we can use its methods
    ButtonsPagePo buttonsPagePo;
    DriverClass driverClass = new DriverClass();


    @Test //@Test annotation tells selenium that this is an individual test scenario
    public void testDoubleClickButton() {
        driver.get("https://demoqa.com/buttons");
        buttonsPagePo.doubleClickFirstButton();
        buttonsPagePo.checkDoubleClickMeLabel();
    }

    @Test
    public void testRightClickButton() {
        driver.get("https://demoqa.com/buttons");
        buttonsPagePo.rightClickSecondButton();
        buttonsPagePo.checkRightClickMeLabel();
    }

    @Test
    public void testDynamicButton() {
        driver.get("https://demoqa.com/buttons");
        buttonsPagePo.clickThirdButton();
        buttonsPagePo.checkDynamicClickMeLabel("You have done a dynamic click");
    }

    @Before //@Before annotation tells Selenium that this will run before each @Test
    public void iniDriver() {
        driverClass.initDriver();
        driver = driverClass.getDriver();
        buttonsPagePo = new ButtonsPagePo(driver);
    }

    @After //@After annotation tells Selenium that this will run after each @Test
    public void closeBrowser() {
        driverClass.quitBrowser();
    }

    @AfterClass  //@AfterClass annotation tells Selenium that this will at the end of this class
    public static void completeTesting() {
        System.out.println("All tests complete :) ");
    }
}
