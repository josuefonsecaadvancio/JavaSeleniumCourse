package firstCodeClass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    //Declaring an instance of buttonsPagePo, so that we can use its methods
    ButtonsPagePo buttonsPagePo = new ButtonsPagePo();
    WebDriver driver;


    @Test //@Test annotation tells selenium that this is an individual test scenario
    public void testDoubleClickButton() {
        buttonsPagePo.doubleClickFirstButton();
        buttonsPagePo.checkDoubleClickMeLabel();
    }
    @Test
    public void testRightClickButton() {
        buttonsPagePo.rightClickSecondButton();
        buttonsPagePo.checkRightClickMeLabel();
    }

    @Test
    public void testDynamicButton() {
        buttonsPagePo.clickThirdButton();
        buttonsPagePo.checkDynamicClickMeLabel("You have done a dynamic click");
    }


    @Before //@Before annotation tells Selenium that this will run before each @Test
    public void initBrowser(){
            System.setProperty("webdriver.chrome.driver", "C:\\browserDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
    }

    @After //@After annotation tells Selenium that this will run after each @Test
    public void closeBrowser(){
        driver.quit();
    }

    @AfterClass  //@AfterClass annotation tells Selenium that this will at the end of this class
    public static void completeTesting(){
        System.out.println("All tests complete :) ");
    }

}
