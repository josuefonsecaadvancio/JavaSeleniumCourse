package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPo {
    private WebDriver driver;

    public LoginPo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

<<<<<<< Updated upstream:src/test/java/PO/LoginPo.java
=======
    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement validatebackpackshoppingcart;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement shoppingcart;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    WebElement addtocartbackpack;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    WebElement errormessage;

    @FindBy(xpath = "//*[@id=\"continue-shopping\"]")
    WebElement  continueshoppingbutton;

>>>>>>> Stashed changes:src/test/java/Class6BDD/PO/LoginPo.java
    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public void fillUserName(String text){
        this.usernameField.sendKeys(text);
    }
    public void fillPassword(String text){
        this.passwordField.sendKeys(text);
    }
    public void clickLoginButton(){
        this.loginButton.click();
    }
<<<<<<< Updated upstream:src/test/java/PO/LoginPo.java
=======

    public void clickshoppingcart(){this.shoppingcart.click();}

    public void clickcontinueshopping(){this.continueshoppingbutton.click();}
    public void validatelabelbackpack(){assertEquals("REMOVE",this.addtocartbackpack.getText());}

    public void validatebackpackshoppincart()
    {assertEquals("Sauce Labs Backpack",this.validatebackpackshoppingcart.getText());}
    public void clickaddtocartbackpack(){this.addtocartbackpack.click();}
    public void errorMessage(){
        System.out.println(errormessage.getText().equals("Epic sadface: Sorry, this user has been locked out."));
    }


>>>>>>> Stashed changes:src/test/java/Class6BDD/PO/LoginPo.java

}
