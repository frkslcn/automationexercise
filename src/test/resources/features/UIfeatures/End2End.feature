@End2End
Feature: US01 User Registration

  @End2End
  Scenario: TC01 User Register


    Then Navigate to url 'http://automationexercise.com'
    Then Verify that home page is visible successfully
    Then Click on Signup  Login button
    Then Verify New User Signup! is visible
    Then Enter name and email address
    Then Click Signup button.
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    Then Fill details: Title, Name, Email, Password, Date of birth.
    Then Select checkbox Sign up for our newsletter!
    Then Select checkbox Receive special offers from our partners!
    Then Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Then Click Create Account button

  @End2End
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
  @End2End
  Scenario: US19_View_&_Cart_Brand_Products

    Given Navigate to url 'http://automationexercise.com'
    Then Click on Products button
    And Verify that Brands are visible on left side bar
    And Click on any brand name
    And Verify that user is navigated to brand page and brand products are displayed
    Then On left side bar, click on any other brand link
    Then Verify that user is navigated to that brand page and can see products

  @End2End
  Scenario: US_08_Verify_All_Products

    Given Navigate to url 'http://automationexercise.com'
    When Verify that home page is visible successfully
    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And Click on 'View Product' of first product
    When User is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand

  @End2End
  Scenario:US_09_Search Product

    Given Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    And Click on 'Products' button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name 'Blue' in search input and click search button
  @End2End
  Scenario: TC-22-Add to cart from Recommended Items

    When Navigate to url 'http://automationexercise.com'
    When Scroll to bottom of page
    And verifies 'RECOMMENDED ITEMS' are visible
    And user clicks on 'Add To Cart' on Recommended product
    And user clicks on 'View Cart' button
    Then verifies that product is displayed in cart page

  @End2End
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
