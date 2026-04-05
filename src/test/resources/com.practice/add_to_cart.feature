Feature: Add to cart

  Scenario: Add one quantity from store
    Given I am on the store page
    When I add a "Blue Shoes" to cart
    Then I should see 1 "Blue Shoes" in the cart
 Scenario Outline: Add one quantity from store -examples
    Given I am on the store page
    When I add a "<product_name>" to cart
    Then I should see 1 "<product_name>" in the cart
   Examples:
     | product_name |
   |  Blue Shoes   |






