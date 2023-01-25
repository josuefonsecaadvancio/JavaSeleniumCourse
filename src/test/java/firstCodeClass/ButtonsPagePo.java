package firstCodeClass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPagePo {
    //Declaring our WebElements
    WebDriver driver;
    WebElement doubleClickMeButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn'])"));
    WebElement rightClickMeButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
    WebElement ClickMeButton = driver.findElement(By.xpath("//button[(text() = 'Click Me')]"));

    WebElement doubleClickMeLabel = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
    WebElement rightClickMeLabel = driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
    WebElement dynamicClickMeLabel = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));

    public ButtonsPagePo(WebDriver _driver) {
        driver = _driver;
    }


    //Declaring our methods
    //Clicks
    public void doubleClickFirstButton() {
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickMeButton).perform();
    }

    public void rightClickSecondButton() {
        Actions action = new Actions(driver);
        action.contextClick(rightClickMeButton).perform();
    }

    public void clickThirdButton() {
        ClickMeButton.click();
    }

    //Asserts
    public void checkDoubleClickMeLabel() {
        String expectedText = doubleClickMeLabel.getText();
        String actualText = "You have done a double click";
        Assert.assertEquals(expectedText, actualText);
    }

    public void checkRightClickMeLabel() {
        Assert.assertEquals("You have done a right click", rightClickMeLabel.getText());
    }

    public void checkDynamicClickMeLabel(String expectedText) {
        String actualText = dynamicClickMeLabel.getText();
        Assert.assertTrue(dynamicClickMeLabel.isEnabled());
        Assert.assertEquals(expectedText, actualText);
    }


}
