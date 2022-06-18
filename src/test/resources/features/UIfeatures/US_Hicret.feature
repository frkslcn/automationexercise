
@smoketest
Feature:Add to cart from Recommended Items


  Scenario: TC-22-Add to cart from Recommended Items

   When Navigate to url 'http://automationexercise.com'
    When Scroll to bottom of page
    And verifies 'RECOMMENDED ITEMS' are visible
    And user clicks on 'Add To Cart' on Recommended product
    And user clicks on 'View Cart' button
    Then verifies that product is displayed in cart page

#  Scenario: TC-23-Verify adress details in checkout page
#
#    When Verify that home page is visible successfully
#    And Click 'Signup / Login' button
#    And Fill all details in Signup and create account
#    And Verify 'ACCOUNT CREATED!' and click 'Continue' button
#    And Verify ' Logged in as username' at top
#    And Add products to cart
#    And Click 'Cart' button
#    And Verify that cart page is displayed
#    And Click Proceed To Checkout
#    And Verify that the delivery address is same address filled at the time registration of account
#    And Verify that the billing address is same address filled at the time registration of account
#    And Click 'Delete Account' button
#    Then Verify ACCOUNT DELETED! and click 'Continue' button
#
#  Scenario: TC-24-download Invoice After Purchase Order
#
#  When Verify that home page is visible successfully
#  And user adds products to cart
#  And user clicks 'Cart' button
#  And Verify that cart page is displayed
#  And user clicks Proceed To Checkout
#  And user clicks 'Register / Login' button
#  And user fills all details in Signup and create account
#  And user verify ACCOUNT CREATED! and click 'Continue' button
#  And Click 'Cart' button
#  And Click 'Proceed To Checkout' button
#  And Verify Address Details and Review Your Order
#  And Enter description in comment text area and click 'Place Order'
#  And Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  And Click 'Pay and Confirm Order' button
#  And Verify success message 'Your order has been placed successfully!'
#  And Click 'Download Invoice' button and verify invoice is downloaded successfully.
#  And Click 'Continue' button
#  And Click 'Delete Account' button
#  Then Verify 'ACCOUNT DELETED!' and click 'Continue' button
#
#
#
#
#
#
#
