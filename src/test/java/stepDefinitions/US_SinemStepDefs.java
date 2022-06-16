package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_SinemPage;
import utilities.Driver;

public class US_SinemStepDefs {

    US_SinemPage us_sinemPage=new US_SinemPage();
    Faker faker=new Faker();

    //04
    @Given("Click on {string} button")
    public void click_on_button(String string) {
        us_sinemPage.signUpLogIn.click();
    }

    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {
        Assert.assertTrue(us_sinemPage.loginToYourAccountText.isDisplayed());
        Driver.wait(2);
    }
    @Then("Enter correct {string} address and {string}")
    public void enter_correct_address_and(String email, String password) {
        us_sinemPage.emailLoginTextBox.sendKeys(email);
        us_sinemPage.passwordTextBox.sendKeys(password);
        Driver.wait(2);
    }
    @Then("Click {string} button")
    public void click_button(String string) {
        us_sinemPage.loginButton.click();
        Driver.wait(2);
    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        Assert.assertTrue(us_sinemPage.loggedInAs.isDisplayed());
        Driver.wait(2);
    }
    @Then("Click {string}")
    public void click(String string) {
        us_sinemPage.logout.click();
        Driver.wait(2);
    }
    @Then("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        Assert.assertTrue(us_sinemPage.loginToYourAccountText.isDisplayed());
    }

  //05
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

    //06
    @Given("Click on Contact Us button")
    public void click_on_contact_us_button() {
        us_sinemPage.contactUs.click();

    }
    @Given("Verify GET IN TOUCH is visible")
    public void verify_get_in_touch_is_visible() {
        Assert.assertTrue(us_sinemPage.getInTouch.isDisplayed());

    }
    @Given("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
        us_sinemPage.nameTextBox.sendKeys(faker.name().fullName());
        Driver.waitAndSendText(us_sinemPage.emailTextBox,faker.internet().emailAddress());
        Driver.waitAndSendText(us_sinemPage.messageBox,faker.harryPotter().book());
        Driver.waitAndSendText(us_sinemPage.subjectTextBox,faker.starTrek().character());

    }
    @Given("Upload file")
    public void upload_file() {
        us_sinemPage.uploadFile.sendKeys("C:\\Users\\tarci\\OneDrive\\Pictures\\Screenshots\\Screenshot (5).png");
        Driver.wait(2);
    }
    @Given("Click Submit button")
    public void click_submit_button() {
        us_sinemPage.submitButton.click();
    }
    @Given("Click OK button")
    public void click_ok_button()  { //throws InterruptedException
        Driver.wait(4);
        Driver.getDriver().switchTo().alert().accept();
    }
    @Given("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        Assert.assertTrue(us_sinemPage.successAlert.isDisplayed());

    }
    @Given("Click {string} button and verify that landed to home page successfully")
    public void click_button_and_verify_that_landed_to_home_page_successfully(String string) {
        us_sinemPage.homeButton.click();
        Assert.assertTrue(us_sinemPage.automationExerciseImage.isDisplayed());

    }


}
