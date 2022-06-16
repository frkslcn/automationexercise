Feature: US_19 - 20 - 21

  Scenario: US07_Verify Test Cases Page

    Given Navigate to url 'http://automationexercise.com'
    Then Click on Products button
    And Verify that Brands are visible on left side bar
    And Click on any brand name
    And Verify that user is navigated to brand page and brand products are displayed
    Then On left side bar, click on any other brand link
    Then Verify that user is navigated to that brand page and can see products