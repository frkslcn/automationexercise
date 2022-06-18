
@smoketest
Feature: US04 US05 US06

  Scenario Outline:US04_Logout

    Given Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    And Click on SignupLogin button
    Then Verify login to account is visible
    Then Enter correct "<email>" address and "<password>"
    And click login
    And verify logged in as username is visible
    Then click logout
    Then Verify that user is navigated to login page

    Examples:
      | email | password |
      |ssss@email.com| 1111|


  Scenario: US05_RegisterUserWithExistingEmail

    Given Navigate to url 'http://automationexercise.com'
    Then Verify that home page is visible successfully
    And Click on SignupLogin button
    And Verify New User Signup! is visible
    Then Enter name and already registered email address
    And Click on Signup button
    Then Verify error 'Email Address already exist!' is visible

