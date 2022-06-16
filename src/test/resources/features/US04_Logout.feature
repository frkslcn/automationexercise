Feature: Logout

  Scenario Outline:

    Given Navigate to url
    And Verify that home page is visible successfully
    And Click on 'Signup / Login' button
    Then Verify 'Login to your account' is visible
    Then Enter correct "<email>" address and "<password>"
    And Click 'login' button
    And Verify that 'Logged in as username' is visible
    Then Click 'Logout'
    Then Verify that user is navigated to login page


    Examples:
    | email | password |
    |ssss@email.com| 1111|