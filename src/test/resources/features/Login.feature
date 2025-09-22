Feature: Login functionality

  Scenario: Sign In and New Customer header validation
    Given user is on the login page
    Then user verifies Sign In header displayed
    And user verifies New Customer header displayed

  Scenario: Field Validation
    Given user is on the login page
    Then user verifies fields username and password
    And user verifies forgotten password should be displayed

  @Smoke
  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters valid username and password
    And clicks on login button
    Then user should be navigated to the My Account screen