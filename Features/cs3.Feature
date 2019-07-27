Feature: search engine 

  Scenario: search for a product in testmeapp
    Given home page arrived
    When click on sign in button
    And enter the username as "laitha"
    And enter the password as "password"123
    And page will directed to loginpage
    And search for any item with min of four letters
    And drop drown list appeared and choose product
    Then page will directed to payment portal
