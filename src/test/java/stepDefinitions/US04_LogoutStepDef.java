package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_SinemPage;
import utilities.Driver;

public class US04_LogoutStepDef {
    US_SinemPage us_sinemPage=new US_SinemPage();

    @Given("Navigate to url")
    public void navigate_to_url() {
        Driver.getDriver().get("https://automationexercise.com/");
    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(us_sinemPage.automationExerciseImage.isDisplayed());
    }
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



}
