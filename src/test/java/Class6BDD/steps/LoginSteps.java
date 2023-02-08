package Class6BDD.steps;

import Class6BDD.PO.LoginPo;
import Class6BDD.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps extends DriverManager {
    LoginPo login = new LoginPo(driver);


    @And("I fill login field with {string}")
    public void iFillLoginFieldWith(String text) {
        login.fillUserName(text);
    }
}
