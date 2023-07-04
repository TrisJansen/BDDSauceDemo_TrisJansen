@Buy
Feature: Buy
    as user i want to pick the product

  Scenario: User pict the product to cart
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    When User sort product list by "Name (Z to A)"
    And User pick the product Test.allTheThings TShirt Red
    And User pick the product Sauce Labs Onesie
    And User click cart logo

  Scenario: User want to remove the product from cart page
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    When User sort product list by "Name (Z to A)"
    And User pick the product Test.allTheThings TShirt Red
    And User pick the product Sauce Labs Onesie
    And User click cart logo
    And User remove Test.allTheThing TShirt Red

  Scenario: User want to checkout the product
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    When User sort product list by "Name (Z to A)"
    And User pick the product Test.allTheThings TShirt Red
    And User pick the product Sauce Labs Onesie
    And User click cart logo
    And User remove Test.allTheThing TShirt Red
    And User want to checkout the product

  Scenario: User fill identity to checkout the product
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    When User sort product list by "Name (Z to A)"
    And User pick the product Test.allTheThings TShirt Red
    And User pick the product Sauce Labs Onesie
    And User click cart logo
    And User remove Test.allTheThing TShirt Red
    And User want to checkout the product
    When User input "Tris" as firstName and input "Jansen" as lastName and input "1271" as postalCode
    Then User Verify checkoutOverview page
    And User has finished purchase the product