@smoketest
Feature: US_10 Verify Subscription in Home Page
  @End2End
  Scenario:TC_1001 Verify Subscription in Home Page


    Given Navigate to url 'http://automationexercise.com'
    Then Verify that home page is visible successfully
    When Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    When Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible

    Scenario:TC02

    Given Navigate to url 'http://automationexercise.com'
    When Verify that home page is visible successfully
    And Click Cart button
    And Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    And Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible