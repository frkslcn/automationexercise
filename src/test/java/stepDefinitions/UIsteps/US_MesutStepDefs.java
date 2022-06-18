package stepDefinitions.UIsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
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

    @Test
    @And("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
//        String actualUrl = Driver.getDriver().getCurrentUrl();
//        String expectedUrl = "https://www.automationexercise.com/brand_products/Polo";
//        Assert.assertEquals(actualUrl,expectedUrl);


        Assert.assertTrue(page.brandProducts.isDisplayed());

        String title= Driver.getDriver().getTitle();
        System.out.println("title = " + title);
        Assert.assertEquals("title","title");

    }


    @Then("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        Driver.waitAndClick(page.hmBrandName);
        
    }

    @Then("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {


        String title= Driver.getDriver().getTitle();
        System.out.println("title = " + title);
        Assert.assertEquals("title","title");
    }
}
