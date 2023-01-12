Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User lauch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on logout link
    Then Page title should be "Your store. Login"
    And Close browser

  Scenario Outline: Successful Login with Valid Credentials DDT
    Given User lauch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com"
    And User enters Email as "<email>" and Password as "<password>"
    And Click on login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on logout link
    Then Page title should be "Your store. Login"
    And Close browser

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |
      | test@yourstore.com  | admin    |
