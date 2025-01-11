Feature: User is able to order on ecommerce website

  Scenario Outline: Able to add product to cart
    Given user is able to launch login page
    When title of login page is "Swag Labs"
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    When user add product to cart
    Then product should be added to cart


    Examples:
      | username       | password     |
      | standard_user  | secret_sauce |


  Scenario Outline: User is able to order product
    Given user is able to launch login page
    When title of login page is "Swag Labs"
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    When user add product to cart
    Then product should be added to cart
    When User complete order
      | firstname   | lastname   | postcode   |
      | John        | wick       | RX1234     |
    Then Order is successful
      | ExpectedMessage                  |
      | Thank you for your order!        |


    Examples:
      | username       | password     |
      | standard_user  | secret_sauce |
