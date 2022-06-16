
@smoketest
Feature: US_07 US_08 US_09 US_25

  Scenario: US07_Verify Test Cases Page

  Given Navigate to url 'http://automationexercise.com'
  Then Verify that home page is visible successfully
  And Click on 'Test Cases' button
  Then Verify user is navigated to test cases page successfully

    Scenario: US_08_Verify_All_Products

   Given Navigate to url 'http://automationexercise.com'
    When Verify that home page is visible successfully
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And Click on 'View Product' of first product
    When User is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand

    Scenario:US_09_Search Product

    Given Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    And Click on 'Products' button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name "Blue" in search input and click search button
    Then Verify 'SEARCHED PRODUCTS' is visible
    Then Verify all the products related to search are visible

      Scenario:TC_25_subscription

   Given Navigate to url 'http://automationexercise.com'
     Then Verify that home page is visible successfully
     And Scroll down page to bottom
      Then Verify SUBSCRIPTION is visible
      And Click on arrow at bottom right side to move upward
    Then Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen