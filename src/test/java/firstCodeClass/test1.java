package firstCodeClass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test1 {
    public static void main(String[] args){
        System.out.println("hello world");
        System.setProperty("webdriver.chrome.driver", "C:\\browserDrivers\\chromedriver.exe"  );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();

        List<WebElement> allitems = driver.findElements(By.className("inventory_item_name"));

        for (WebElement currentitem: allitems ) {

            String curreitem_text = currentitem.getText();
            System.out.println(curreitem_text);
        }

        /*WebElement backpack_addtocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        WebElement bikelight_addtocart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
        WebElement shoppingcart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));

        backpack_addtocart.click();
        bikelight_addtocart.click();
        shoppingcart.click();

        boolean item1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).isDisplayed();
        if (item1) {
            System.out.println("Element backpack is displayed");
        } else {
            System.out.println("Element backpack is not displayed");
        }

        boolean item2 = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).isDisplayed();
        if (item2) {
            System.out.println("Element bikelight is displayed");
        } else {
            System.out.println("Element bikelight is not displayed");
        }*/

        //Use the code below, to match the expected text of the first item in the shop
        //Assert.assertEquals();



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver.quit();


    }
}
