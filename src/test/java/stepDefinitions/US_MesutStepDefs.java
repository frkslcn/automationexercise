package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_MesutPage;
import utilities.Driver;

public class US_MesutStepDefs {

    US_MesutPage page = new US_MesutPage();

    @Then("Verify that Brands are visible on left side bar")
    public void verify_that_brands_are_visible_on_left_side_bar() {
        Assert.assertTrue(page.brandsButton.isDisplayed());
    }

    @And("Click on any brand name")
    public void clickOnAnyBrandName() {
        page.poloBrandName.click();
    }

    @And("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.automationexercise.com/brand_products/Polo";
        Assert.assertEquals(expectedUrl,actualUrl);
    }


}
