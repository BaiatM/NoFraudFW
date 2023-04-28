Feature: Adding an item dynamic functionality

  Background: User is logged in
    Given user verifies its a login page
    And user enters valid "valid.username" and "valid.password"
    When user clicks on sign in button
    Then verify user is successfully logged in to the account

  @Smoke
  Scenario: User is able to add target item to the cart and proceed to place an order
    Given user sees all the products
    And user adds "target.item" to cart
    And user clicks on the cart icon
    When user verifies the cart page and "target.item"
    And user clicks on checkout button
    And user fills out the form with fake credentials
    And user clicks on continue button
    When user clicks on finish button
    Then user should see the confirmation letter

#    here we have "Adding an item dynamic functionality" feature to find one specific item and place an order
