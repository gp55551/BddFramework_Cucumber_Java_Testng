Feature: Address Book functionality

  Scenario: Address Book new Entry
    Given user is on the login page
    When user enters valid username and password
    And clicks on login button
    Then user should be navigated to the My Account screen
    Then user clicks Address Book link
    Then user verifies Address book header
    And user verifies Buttons present

