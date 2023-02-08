package firstCodeClass.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class new_Page {
    private final WebDriver driver;

    public new_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath ="//*[@id=\"login-button\"]" )
    WebElement loginbutton;


    @FindBy(xpath = "//*[@id=\"user-name\"]")
    WebElement user_namebox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement user_passwordbox;

    @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
    WebElement hamburgermenu;

    @FindBy(xpath = "//*[@id=\"about_sidebar_link\"]")
    WebElement aboutpage;

    public void clickaboutpage(){
        Actions action = new Actions(driver);
        action.click(aboutpage).perform();
    }

    public void clickhamburgermenu(){
        Actions action = new Actions(driver);
        action.click(hamburgermenu).perform();
    }

    public void sendinfouser(){
        Actions action = new Actions(driver);
        action.sendKeys("standard_user").perform();
    }

    public void sendinfopassword(){
        Actions action = new Actions(driver);
        action.sendKeys("secret_sauce").perform();
    }

    public void clickuser(){
        Actions action = new Actions(driver);
        action.click(user_namebox).perform();
    }

    public void clickpassword(){
        Actions action = new Actions(driver);
        action.click(user_passwordbox).perform();
    }

    public void clickloginbutton(){
        Actions action = new Actions(driver);
        action.click(loginbutton).perform();
    }

}
