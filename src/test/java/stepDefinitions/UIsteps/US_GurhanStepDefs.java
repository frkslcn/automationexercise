package stepDefinitions.UIsteps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.US_GurhanPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_GurhanStepDefs {

    US_GurhanPage hmpage = new US_GurhanPage();
    Faker faker=new Faker();
Actions action= new Actions(Driver.getDriver());

    @Test


    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));

    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(hmpage.homepageIsDisplayed.isDisplayed());

    }
    @When("Scroll down to footer")
    public void scroll_down_to_footer() {
        Driver.scrollIntoViewJS(hmpage.SubscriptionText);

    }
    @Then("Verify text {string}")
    public void verify_text(String string) {
        Assert.assertTrue(hmpage.SubscriptionText.isDisplayed());

    }
    @When("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {
        Driver.waitAndSendText(hmpage.emailAddressBox,faker.internet().emailAddress(),1);
        Driver.waitAndClick(hmpage.arrowButton,2);
    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        Assert.assertTrue(hmpage.successfullySubscribedMessage.isDisplayed());

    }


    @And("Click Cart button")
    public void clickCartButton() {
        Driver.waitAndClick(hmpage.cartButton);
    }

    //---------------US_12--------------------------
    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        Assert.assertTrue(hmpage.firstProductCheck.isDisplayed());
        Assert.assertTrue(hmpage.secondProductCheck.isDisplayed());
    }


    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {

        Assert.assertTrue(hmpage.firstProductPrice.isDisplayed());
        Assert.assertTrue(hmpage.secondProductPrice.isDisplayed());
        Assert.assertTrue(hmpage.firstProductQuantity.isDisplayed());
        Assert.assertTrue(hmpage.secondProductQuantity.isDisplayed());
        Assert.assertTrue(hmpage.firstProductTotal.isDisplayed());
        Assert.assertTrue(hmpage.secondProductTotal.isDisplayed());

    }
}