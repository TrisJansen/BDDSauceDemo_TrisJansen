@Login
Feature: Login
  As a user i want to login website sauce demo


  Scenario: Normal Login
    Given User already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page

#  Scenario Outline: Invalid login
#    Given User already on login page
#    When User input "<userName>" as userName and input "<password>" as password
#    Then User see "<errorText>" as error text on login page
#Examples:
#  | userName      | password     | errorText                                                                 |
#  | standard_user |              | Epic sadface: Password is required                                        |
#  |               | secret_sauce | Epic sadface: Username is required                                        |
#  |               |              | Epic sadface: Username is required                                        |
#  | Butet         | Batak        | Epic sadface: Username and password do not match any user in this service |