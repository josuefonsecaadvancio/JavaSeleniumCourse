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
    And I click continue shopping button
    Then I click on shopping cart
    And I validate backpack is on the shopping

    Scenario: Shopping in demoblaze STORE
    Given I go to "https://demoblaze.com/index.html"
    Then I click on the samsung phone
    Then I select add to cart phone
    Then I click add to cart demon blaze shop
    Then I assert label
    Then I click on place order
    Then I fill name "Josue"
    Then I fill country "Mexico"
    Then I fill city "Ensenada"
    Then I fill card "0069"
    Then I fill month "Marzo"
    Then I fill year "2023"
    Then I click the purchase button







    #Complete this exercise
