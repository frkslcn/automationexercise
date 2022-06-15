package stepDefinitions;

import pages.US_BunyaminPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;

public class US_BunyaminStepDefs {

    US_BunyaminPage testcase =new US_BunyaminPage();

    @Then("Click on {string} button")
    public void click_on_button(String string) {
        Driver.waitAndClick(testcase.testCaseButtn);

    }
    @Then("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        Assert.assertTrue(testcase.testCaseText.isDisplayed());

    }
}
