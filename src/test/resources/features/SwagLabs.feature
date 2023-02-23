  Feature: SwagLabs Login tests
  Scenario: Login with standard_user
    Given I go to "https://www.saucedemo.com/"
    Then I fill username "example"
    Then Just wait 5000

    #Complete this exercise

  Scenario: Login with locked_out_user and verify locked out message
    Then I fill username "otherExample"
    Then I assert text
    Then Just wait 5000

  Scenario: Homework7
    Given I go to "https://www.saucedemo.com/"
    And I fill username "standard_user"
    Then I fill password "secret_sauce"
    Then I click login button
    And I click add to cart backpack button
    Then Just wait 5000
    And I validate REMOVE label on button for backpack
    Then I click on shopping cart
    Then I validate backpack is on the shopping

    #Complete this exercise
