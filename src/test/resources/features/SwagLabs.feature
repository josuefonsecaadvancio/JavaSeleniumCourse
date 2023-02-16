Feature: SwagLabs Login tests
  Scenario: Login with standard_user
    Given I go to "https://www.saucedemo.com/"
    Then I fill username "locked_out_user"
    Then I fill password "secret_sauce"
    Then I click login button
    Then Just wait 5000
    Then I assert text
    Then Just wait 5000

    #Complete this exercise
