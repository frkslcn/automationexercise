Feature: US04 US05 US06

  Scenario Outline:US04_Logout

    Given Navigate to url 'http://automationexercise.com'
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


  Scenario: US05_RegisterUserWithExistingEmail

    Given Navigate to url 'http://automationexercise.com'
    Then Verify that home page is visible successfully
    And Click on 'Signup / Login' button
    And Verify New User Signup! is visible
    Then Enter name and already registered email address
    And Click on Signup button
    Then Verify error 'Email Address already exist!' is visible


  Scenario: US06_ContactUs

    *  Navigate to url 'http://automationexercise.com'
    *  Verify that home page is visible successfully
    *  Click on Contact Us button
    *  Verify GET IN TOUCH is visible
    *  Enter name, email, subject and message
    *  Upload file
    *  Click Submit button
    *  Click OK button
    *  Verify success message 'Success! Your details have been submitted successfully.' is visible
    *  Click 'Home' button and verify that landed to home page successfully