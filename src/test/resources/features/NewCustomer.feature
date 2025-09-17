Feature: New Customer functionality

  Scenario: new Customer Page header validation
    Given user is on the login page
    When user clicks continue button
    Then user navigates to New Customer page

  Scenario: new Customer field validation
    Given user is on the login page
    When user clicks continue button
    And user is on the new Customer page
    Then user login page link displayed

  Scenario: new Customer field validation
    Given user is on the login page
    When user clicks continue button
    And user is on the new Customer page
    Then user verifies all the fields displayed
    And user verifies buttons displayed