package firstCodeClass;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\browserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WaitTests waitTests = new WaitTests(driver);
        waitTests.testWaitImplicit(7);
        waitTests.testWaitExplicit(30);
        waitTests.testFluentWait(30, 10000);
        driver.quit();


        //Use the code below, to match the expected text of the first item in the shop
        //Assert.assertEquals();


    }


    ButtonsPagePo buttonsPagePo = new ButtonsPagePo();

    @Test
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

}
