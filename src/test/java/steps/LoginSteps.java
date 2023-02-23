package steps;

import PO.LoginPo;
import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps extends DriverManager {

    LoginPo loginPo = new LoginPo(driver);
    @And("I fill username {string}")
    public void iFillUsername(String text) {
        loginPo.fillUserName(text);
    }

    @Then("I fill password {string}")
    public void iFillPassword(String text) {loginPo.fillPassword(text);
    }

    @Then("I click login button")
    public void iClickLoginButton() {loginPo.clickLoginButton();}

    @Then("I assert text")
    public void iErrorMessage() {
        loginPo.errorMessage();
    }

    @Then("I validate backpack is on the shopping")
    public void iValidatebackpackshoppincart(){loginPo.validatebackpackshoppincart();}

    @Then("I click on shopping cart")
    public void iClickshoppingcart(){loginPo.clickshoppingcart();}

    @Then("I validate REMOVE label on button for backpack")
    public void iValidatelabelbackpack(){loginPo.validatelabelbackpack();}

    @Then("I click continue shopping button")
    public void iClickcontinueshopping(){loginPo.clickcontinueshopping();}

    @Then("I click add to cart backpack button")
    public void iClickaddtocartbackpack(){
        loginPo.clickaddtocartbackpack();
    }

}

