Feature: Search functionality
  @Smoke
  Scenario: Search field validation
    Given user is on the login page
    Then user verifies Search field displayed

  @Smoke
  Scenario: Search product validation
    Given user is on the login page
    When user search iphone in the search field and clicks search button
    Then user verifies product iphone is displayed

  Scenario Outline: Button validation
    Given user is on the login page
    When user search "<product>" in the search field and clicks search button
    Then user verifies Add to cart button  is displayed
    And user verifies Heart Button is displayed
    And user verifies Exchange Button is displayed
    Examples:
      | product |
      | iPhone  |

  @Regression
  Scenario:  Wishlist validation
    Given user is on the login page
    When user enters valid username and password
    And clicks on login button
    And user should be navigated to the My Account screen
    And user search iphone in the search field and clicks search button
    And user clicks heart button
    Then user verifies wishlist Success message
    And user navigates to wishlist
    And user verifies Wishlist header
    And user verifies iphone is in the list

