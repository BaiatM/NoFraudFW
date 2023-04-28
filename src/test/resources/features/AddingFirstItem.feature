Feature: Adding an item functionality

  Background: User is logged in
    Given user verifies its a login page
    And user enters valid "valid.username" and "valid.password"
    When user clicks on sign in button
    Then verify user is successfully logged in to the account

  @Smoke
  Scenario: User is able to add first item to the cart and proceed to place an order
    Given user sees all the products
    And user adds first item to cart
    And user clicks on the cart icon
    When user verifies the cart page and added item
    And user clicks on checkout button
    And user fills out the form with fake credentials
    And user clicks on continue button
    When user clicks on finish button
    Then user should see the confirmation letter

  @Smoke
  Scenario Outline: User is able to add one item to the cart and proceed to place an order
    Given user adds "<inventory.item>" to cart
    And user clicks on the cart icon
    And user clicks on checkout button
    And user fills out the form with fake credentials
    And user clicks on continue button
    When user clicks on finish button
    Then user should see the confirmation letter
    Examples:
      | inventory.item  |
      | inventory.item1 |
      | inventory.item2 |
      | inventory.item3 |
      | inventory.item4 |
      | inventory.item5 |
      | inventory.item6 |

#    here we have "Adding an item functionality" first scenario is hardcoded,
#    then i though it would be a good idea to make it as Scenario Outline,
#    and I kept first scenario to go through as a manual tester
