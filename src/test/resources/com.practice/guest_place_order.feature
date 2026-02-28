Feature: place an order
  Scenario: using deafult payement option
    Given I am a guest customer
    And my billing details are
      |firstname|lastname|country|Address_line1|city|state|zip|email|
      |  demo| user|United States(Us)|6300Spring Creek|Plano|Texas|75001|askomdch@gmail.com|
     And I have a product in the cart page
    And I am on the checkout page
    When I provide billing details
#    |firstname|lastname|country|Address_line1|city|state|zip|email|
#    |  demo| user|United States(Us)|6300Spring Creek|Plano|Texas|75001|askomdch@gmail.com|
    And I place an order
    Then the order should placed successfuly

