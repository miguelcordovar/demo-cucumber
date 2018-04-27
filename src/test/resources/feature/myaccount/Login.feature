Feature: Login to My Account

  This feature deals with the login functionality of the application

  @First
  Scenario: Login with correct username and password
    Given I navigate to the My Account login page
    And I enter username as "testuser" and the password as "Test@123"
    And I click login button
    Then I should see the My Account home page

  Scenario: Login with correct username and password
    Given I navigate to the My Account login page
    And I enter username as "testuser" and the password as "Test@123"
    And I click login button
    Then I should see the My Account home page


  Scenario: Login with correct username and password
    Given I navigate to the My Account login page
    And I enter username as "testuser" and the password as "Test@123"
    And I click login button
    Then I should see the My Account home page

  Scenario: Login with correct username and password
    Given I navigate to the My Account login page
    And I enter username as "testuser" and the password as "Test@123"
    And I click login button
    Then I should see the My Account home page

  @Last
  Scenario: Login with incorrect username and password
    Given I navigate to the My Account login page
    And I enter username as "testuser" and the password as "Test@1234"
    And I click login button
    Then I should see the error message "ERROR: The password you entered for the username testuser is incorrect. Lost your password?"

