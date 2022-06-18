package stepDefinitions.UIsteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_AyselPage;
import pages.US_SinemPage;
import utilities.Driver;
import utilities.ReusableMethods;


public class US_AyselStepDefs {
    Faker faker = new Faker();

    US_AyselPage newUser = new US_AyselPage();
    US_SinemPage us_sinemPage=new US_SinemPage();

    Actions actions;
    Select select;


    @Then("Click on Signup  Login button")
    public void click_on_signup_login_button() {
        Driver.waitAndClick(newUser.signUpButnhomepage);
       // Driver.waitAndClick(newUser.newUserSignupButton);
       // Assert.assertTrue(us_sinemPage.newUserSignUpText.isDisplayed());


    }

    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        Driver.waitAndSendText(newUser.newUsersignUpname,faker.name().firstName());
        Driver.waitAndSendText(newUser.newUsersignUpemail,faker.internet().emailAddress());

    }

    @Then("Click Signup button.")
    public void click_signup_button() {
        Driver.waitAndClick(newUser.newUserSignupButton);


    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {
        Assert.assertTrue(newUser.ENTERACCOUNT_INFORMATIONivisible.isDisplayed());

    }

    @Then("Fill details: Title, Name, Email, Password, Date of birth.")
    public void fill_details_title_name_email_password_date_of_birth() {
       Driver.waitAndClick(newUser.genderRadioBotton);
       Driver.waitAndSendText(newUser.newAccountPasswordBox,faker.internet().password());
        WebElement dayDropdown = Driver.getDriver().findElement(By.id("days"));
        select = new Select(dayDropdown);
        select.selectByVisibleText("3");
        WebElement monthDropdown = Driver.getDriver().findElement(By.id("months"));
        select = new Select(monthDropdown);
        select.selectByValue("4");
        WebElement yearDropdown = Driver.getDriver().findElement(By.id("years"));
        select = new Select(yearDropdown);
        select.selectByIndex(9);
        ReusableMethods.waitFor(3);


    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        Driver.waitAndClick(newUser.chechBox1);


    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        Driver.waitAndClick(newUser.chechBox2);


    }

    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

        Driver.waitAndSendText(newUser.firstnameBox,faker.name().firstName());
        Driver.waitAndSendText(newUser.lastnameBox,faker.name().fullName());
        newUser.companyBox.sendKeys("techpro");
        newUser.address1.sendKeys("Abd Street");
        newUser.address2.sendKeys("NY Road");
        WebElement countryDropdown = Driver.getDriver().findElement(By.id("country"));
        select = new Select(countryDropdown);
        select.selectByIndex(3);
        newUser.stateBox.sendKeys("Tazmania");
        newUser.cityBox.sendKeys("Perth");
        newUser.zipcodeBox.sendKeys("1213");
        newUser.mobile_numberBox.sendKeys("567-89-05");



    }

    @Then("Click Create Account button")
    public void click_create_account_button() {
        Driver.waitAndClick(newUser.createAccountButton);

    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        Driver.wait(3);
        Driver.scrollIntoViewJS(newUser.accountCreatedText);
        Assert.assertTrue(newUser.accountCreatedText.isDisplayed());

    }

    @Then("Click Continue button")
    public void click_continue_button() {
        Driver.wait(3);
        Driver.scrollIntoViewJS(newUser.continueButton);
        Driver.wait(3);

        Driver.waitAndClick(newUser.continueButton);

    }

    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(newUser.loggedInText.isDisplayed());

    }

    @Then("Click Delete Account button")
    public void click_delete_account_button() {
        Driver.waitAndClick(newUser.deleteaccountButton);

    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
       Assert.assertTrue(newUser.deleteaccountText.isDisplayed());

    }

}