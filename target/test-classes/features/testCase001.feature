Feature: testCase001
  Scenario: Add product to a basket
    Given I open shop website
    When I open first category
    And I choose second product
    And I click Add to the basket button
    And I click check the basket
    And I see my product in the basket

