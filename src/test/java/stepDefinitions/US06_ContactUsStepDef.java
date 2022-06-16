package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import pages.US_SinemPage;
import utilities.Driver;

public class US06_ContactUsStepDef {
    US_SinemPage us_sinemPage=new US_SinemPage();
     Faker faker=new Faker();

    @Given("Navigate to url  {string}")
    public void navigate_to_url(String string) {
       Driver.getDriver().get("https://automationexercise.com/");
    }
    @Given("Verify that homepage is visible successfully")
    public void verify_that_homepage_is_visible_successfully() {
        Assert.assertTrue(us_sinemPage.automationExerciseImage.isDisplayed());

    }
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
