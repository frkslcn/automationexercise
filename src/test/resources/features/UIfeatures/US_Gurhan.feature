@smoketest
Feature: US_10, US_11, US_12

  Scenario:US_10 Verify Subscription in Home Page

    Given Navigate to url 'http://automationexercise.com'
    Then Verify that home page is visible successfully
    When Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    When Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible



    Scenario:US_11 Verify Subscription in Cart page

    Given Navigate to url 'http://automationexercise.com'
    When Verify that home page is visible successfully
    And Click Cart button
    And Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    And Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible


  Scenario:US_12 Add Products in Cart

  Given Navigate to url 'http://automationexercise.com'
  Then Verify that home page is visible successfully
  And Click on Products button
  And user clicks products page button
  And user hover over first product and click add to cart
  And user clicks continue shopping button
  And hover over second product and click add to cart
  And user clicks cart button
  Then Verify both products are added to Cart
  Then Verify their prices, quantity and total price

