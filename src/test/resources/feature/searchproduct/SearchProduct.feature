Feature: Search Product

  This feature deals with the search product functionality

  @First
  Scenario: Search existing Product
    Given I navigate to the Home Page
    And I enter "iphone" in the search text box and press Enter key
    Then I should see the the iPhone products list