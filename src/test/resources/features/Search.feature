Feature: Search functionality

  Scenario: Search field validation
    Given user is on the login page
    Then user verifies Search field displayed

  Scenario: Search product validation
    Given user is on the login page
    When user search iphone in the search field and clicks search button
    Then user verifies product iphone is displayed

  Scenario: Button validation
    Given user is on the login page
    When user search iphone in the search field and clicks search button
    Then user verifies Add to cart button  is displayed
    And user verifies Heart Button is displayed
    And user verifies Exchange Button is displayed

