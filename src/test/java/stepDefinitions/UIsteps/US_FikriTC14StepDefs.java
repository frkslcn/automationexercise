package stepDefinitions.UIsteps;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.US_AyselPage;
import pages.US_FikriTC14Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_FikriTC14StepDefs {
    US_FikriTC14Page placeOrderCheckoutPage= new US_FikriTC14Page();
    US_AyselPage signUp= new US_AyselPage();

    Faker faker=new Faker();

    Actions actions = new Actions(Driver.getDriver());

//    @When("user launches the browser")
//    public void user_launches_the_browser() {
//        Driver.getDriver();
//    }
    @Given("Navigate to Url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));

    }
    @Then("Verify that home page is visible Successfully")
    public void verify_that_home_page_is_visible_Successfully() {
        Assert.assertTrue(placeOrderCheckoutPage.homepageIsDisplayed.isDisplayed());
    }
    @Then("user clicks products page button")
    public void user_clicks_products_page_button() {
        placeOrderCheckoutPage.productsButton.click();


        }
    @Then("user hover over first product and click add to cart")
    public void user_hover_over_first_product_and_click_add_to_cart() {

     Driver.wait(3);
     //actions.sendKeys(Keys.PAGE_DOWN).perform();

     actions.moveToElement(placeOrderCheckoutPage.firstProductBeforeHovOv).perform();
     Driver.waitAndClick(placeOrderCheckoutPage.firstProductAfterHovOv, 3);

     // //div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]


    }
    @Then("user clicks continue shopping button")
    public void user_clicks_continue_shopping_button() throws InterruptedException {
        //Driver.wait(2);
        Thread.sleep(3000);
        Driver.clickWithJS(placeOrderCheckoutPage.continueShoppingBtn);
    }
    @Then("hover over second product and click add to cart")
    public void hover_over_second_product_and_click_add_to_cart() {
        Driver.wait(3);


        actions.moveToElement(placeOrderCheckoutPage.secondProductBeforeHovOv).perform();
        Driver.waitAndClick(placeOrderCheckoutPage.secondProductAfterHovOv, 3);

    }


    @Then("user clicks cart button")
    public void user_clicks_cart_button() {

        placeOrderCheckoutPage.cartButtonHomePage.click();

    }

    @Then("verifies that cart page is displayed")
    public void verifiesThatCartPageIsDisplayed() {

        Assert.assertTrue(placeOrderCheckoutPage.shoppingCartText.isDisplayed());
    }

    @And("click proceed to checkout")
    public void clickProceedToCheckout() {

        placeOrderCheckoutPage.proceedToCheckoutButton.click();
    }

    @And("user clicks register login button")
    public void userClicksRegisterLoginButton() {

        placeOrderCheckoutPage.registerLoginButton.click();
    }

    @When("user enters name and email")
    public void user_enters_name_and_email() {
       Driver.waitAndSendText(signUp.newUsersignUpname,"Fikri");
       Driver.waitAndSendText(signUp.newUsersignUpemail,"fikri@gmail.com");

    }
    @When("user clicks signup_button")
    public void user_clicks_signup_button() {
        Driver.waitAndClick(signUp.newUserSignupButton);
    }
    @When("user verifies that enter account information is visible")
    public void user_verifies_that_enter_account_information_is_visible() {

    Assert.assertTrue(placeOrderCheckoutPage.enterAccInfText.isDisplayed());

   }
    @When("user fills details")
    public void user_fills_details() {


    }
//    @When("user selects checkbox signup for our newslater")
//    public void user_selects_checkbox_signup_for_our_newslater() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
    @When("user selects checkbox receive special offers")
    public void user_selects_checkbox_receive_special_offers() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user fills details2")
    public void user_fills_details2() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks create account button")
    public void user_clicks_create_account_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user verifies that acount is created")
    public void user_verifies_that_acount_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks continue button")
    public void user_clicks_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user verifies that logged in")
    public void user_verifies_that_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





    @And("user  clicks cart button")
    public void userClicksCartButton() {

        placeOrderCheckoutPage.cartButtonCheckout.click();
    }


    @And("user clicks proceed to checkout button")
    public void userClicksProceedToCheckoutButton() {

        placeOrderCheckoutPage.proceedToCheckoutButton.click();
    }

    @And("user verifies Address Details and Review Your Order")
    public void userVerifiesAddressDetailsAndReviewYourOrder() {

        Assert.assertTrue(placeOrderCheckoutPage.addressVerificationText.isDisplayed());
    }

    @And("user enters description in comment text area and click place order")
    public void userEntersDescriptionInCommentTextAreaAndClickPlaceOrder() {

        placeOrderCheckoutPage.messageBox.sendKeys("Hello world");
        placeOrderCheckoutPage.placeOrderBox.click();
    }

    @And("user enters payment details Name on Card Card Number CVC Expiration date")
    public void userEntersPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {

        placeOrderCheckoutPage.nameOnCard.sendKeys("Fikri");
        placeOrderCheckoutPage.cardNumberBox.sendKeys("2554662545");
        placeOrderCheckoutPage.cvcBox.sendKeys("546");
        placeOrderCheckoutPage.expieryMonth.sendKeys("10");
        placeOrderCheckoutPage.expieryYear.sendKeys("2025");
    }

    @And("user click Pay and Confirm Order button")
    public void userClickPayAndConfirmOrderButton() {

        placeOrderCheckoutPage.payAndOrderButton.click();
    }

    @And("user verifies success message Your order has been placed successfully")
    public void userVerifiesSuccessMessageYourOrderHasBeenPlacedSuccessfully() {

        Assert.assertTrue(placeOrderCheckoutPage.orderPlacedText.isDisplayed());
    }

    @And("user click Delete Account button")
    public void userClickDeleteAccountButton() {
        placeOrderCheckoutPage.deleteAccountButton.click();
    }

    @Then("user verifies account deleted and clicks Continue button")
    public void userVerifiesAccountDeletedAndClicksContinueButton() {

        String deleteAccountTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(deleteAccountTitle.contains("Delete Account"));
    }
}
