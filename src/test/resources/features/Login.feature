Feature: User is able to login to the ecommerce website

  Scenario Outline: Able to login to ecommerce website
    Given user is able to launch login page
    When title of login page is "Swag Labs"
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then Close the browser
    Examples:
      | username       | password     |
      | standard_user  | secret_sauce |


  Scenario Outline: login fail using incorrect password
    Given user is able to launch login page
    When title of login page is "Swag Labs"
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user gets login error

    Examples:
      | username       | password     |
      | standard_user  | secret_sauce1 |