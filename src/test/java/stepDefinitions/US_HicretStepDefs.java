package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US_HicretPage;
import utilities.Driver;
import utilities.JSUtils;

public class US_HicretStepDefs extends US_HicretPage {

    Actions actions;

    @When("Scroll to bottom of page")
    public void scroll_to_bottom_of_page() {
        JSUtils.scrollDownByJS();
    }
    @When("verifies {string} are visible")
    public void verifies_are_visible(String string) {

        Assert.assertTrue(recommendedItems.isDisplayed());
    }
    @When("user clicks on {string} on Recommended product")
    public void user_clicks_on_on_recommended_product(String string) {
        Driver.waitAndClick(addToCartRecomment);
    }
    @When("user clicks on {string} button")
    public void user_clicks_on_button(String string) {
       Driver.waitAndClick(viewCart);
    }
    @Then("verifies that product is displayed in cart page")
    public void verifies_that_product_is_displayed_in_cart_page() {
       Assert.assertTrue(stylishDress.isDisplayed());
    }


    @And("Click {string} button")
    public void clickSignupLoginButton() {
    }

    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {
    }

    @And("Verify {string} and click {string} button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
    }

    @And("Verify {string} at top")
    public void verifyLoggedInAsUsernameAtTop() {
    }

    @And("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
    }

    @And("Add products to cart")
    public void addProductsToCart() {
    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
    }

    @And("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
    }

    @And("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
    }

    @Then("Verify ACCOUNT DELETED! and click {string} button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {
    }

    @And("user adds products to cart")
    public void userAddsProductsToCart() {
    }

    @And("user clicks {string} button")
    public void userClicksCartButton() {
    }

    @And("user clicks Proceed To Checkout")
    public void userClicksProceedToCheckout() {
    }

    @And("user fills all details in Signup and create account")
    public void userFillsAllDetailsInSignupAndCreateAccount() {
    }

    @And("user verify ACCOUNT CREATED! and click {string} button")
    public void userVerifyACCOUNTCREATEDAndClickContinueButton() {
    }


    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
    }

    @And("Enter description in comment text area and click {string}")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
    }

    @And("Verify success message {string}")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
    }

    @And("Click {string} button and verify invoice is downloaded successfully.")
    public void clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() {
    }
}
