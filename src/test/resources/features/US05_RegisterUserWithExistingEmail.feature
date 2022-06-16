Feature: US05_RegisterUserWithExistingEmail

  Scenario: US05

  Given Navigate to url 'http://automationexercise.com'
  Then Verify that home page is visible
  And Click  'Signup / Login' button
  And Verify New User Signup! is visible
  Then Enter name and already registered email address
  And Click on Signup button
  Then Verify error 'Email Address already exist!' is visible