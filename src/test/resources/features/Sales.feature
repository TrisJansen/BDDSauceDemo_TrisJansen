@Sales
  Feature: Sales
    as a user i want to filter things by filter cart

  Scenario: user sort product cart
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    When User sort product list by "Price (high to low)"
