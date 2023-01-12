Feature: Customers

Scenario: Add new Customer
Given User lauch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on login
    Then User can view the Dashboard
    When User click on customer Menu
    And Click on Customer Menu Item
    And Click on Add New button
    Then User can view Add new customer page
    When User enter customer info
    And Click on save button
    Then User can view cofirmation message "The new customer has been added successfully."
    And Close browser