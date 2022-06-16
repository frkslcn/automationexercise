package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_SinemPage;
import utilities.Driver;

public class US05_RegisterUserWithExistingEmailStepDef {
   US_SinemPage us_sinemPage=new US_SinemPage();

    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get("https://automationexercise.com/");
    }
    @Then("Verify that home page is visible")
    public void verify_that_home_page_is_visible() {
        Assert.assertTrue(us_sinemPage.automationExerciseImage.isDisplayed());

    }
    @Then("Click  {string} button")
    public void click_button(String string) {
        us_sinemPage.signUpLogIn.click();

    }
    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        Assert.assertTrue(us_sinemPage.newUserSignUpText.isDisplayed());

    }
    @Then("Enter name and already registered email address")
    public void enter_name_and_already_registered_email_address() {
        us_sinemPage.nameNewUserTextBox.sendKeys("ssss");
        us_sinemPage.emailNewUserTextBox.sendKeys("ssss@email.com");

    }
    @Then("Click on Signup button")
    public void click_on_signup_button() {
        us_sinemPage.signUpNewUser.click();
    }
    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
      Assert.assertTrue(us_sinemPage.emailAlreadyExistAlert.isDisplayed());
    }


}
