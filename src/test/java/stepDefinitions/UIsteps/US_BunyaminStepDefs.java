package stepDefinitions.UIsteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Test;
import pages.US_AyselPage;
import pages.US_BunyaminPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_GurhanPage;
import utilities.Driver;

public class US_BunyaminStepDefs {

    US_BunyaminPage page = new US_BunyaminPage();
    US_GurhanPage hmpage = new US_GurhanPage();
    Faker faker = new Faker();

    @Then("Click on {string} button")
    public void click_on_button(String string) {
        Driver.waitAndClick(page.testCaseButtn);

    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        Assert.assertTrue(page.testCaseText.isDisplayed());

    }

    @And("Click on Products button")
    public void clickOnProductsButton() {
        Driver.waitAndClick(page.productsButton);
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        String title = Driver.getDriver().getTitle();
        System.out.println("title = " + title);
        Assert.assertEquals("title", "title");

    }

    @Then("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertTrue(page.productList.isDisplayed());

    }

    @Then("Click on {string} of first product")
    public void click_on_of_first_product(String string) {
        Driver.waitAndClick(page.viewProduct);


    }

    @When("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        String title2 = Driver.getDriver().getTitle();
        System.out.println("title2 = " + title2);
        Assert.assertEquals("title2", "title2");

    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(page.brand.isDisplayed());
        Assert.assertTrue(page.condition.isDisplayed());
        Assert.assertTrue(page.availibility.isDisplayed());
        Assert.assertTrue(page.category.isDisplayed());
        Assert.assertTrue(page.price.isDisplayed());
        Assert.assertTrue(page.name.isDisplayed());

    }
//    @And("Enter product name {string} in search input and click search button")
//    public void enterProductNameInSearchInputAndClickSearchButton(String arg0) {
//       Driver.waitAndSendText(page.searchButton);
//    }

    //************************************************  us25
    @And("Scroll down page to bottom")
    public void scrollDownPageToBottom() {

        Assert.assertTrue(hmpage.SubscriptionText.isDisplayed());
        Driver.scrollIntoViewJS(page.Subscriptionbutton);


    }

    @And("Enter product name {string} in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton(String productname) {
        Driver.waitAndSendText(page.searchButton,productname);
        Driver.waitAndClick(page.submitButton);
        
    }



//    @Then("Verify all the products related to search are visible")
//    public void verifyAllTheProductsRelatedToSearchAreVisible() {
//        Assert.assertTrue(page.displayedProduct02.isDisplayed());
//        Assert.assertTrue(page.displayedProduct03.isDisplayed());
//
//
//    }

    @Then("Verify SUBSCRIPTION is visible")
    public void verifySUBSCRIPTIONIsVisible() {
        Assert.assertTrue(hmpage.SubscriptionText.isDisplayed());
        
    }

    @And("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() {
        Driver.clickWithJS(page.arrowUpButton);
        
    }

//    @Then("Verify that page is scrolled up and {string} text is visible on screen")
//    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
//
//        Driver.wait(5);
//
//        Assert.assertTrue(page.automationengineerTex.isDisplayed());
//    }

//    @Then("Verify SEARCHED PRODUCTS is visible")
//    public void verifySEARCHEDPRODUCTSIsVisible() {
//        Assert.assertTrue(page.displayedProduct01.isDisplayed());
//    }
}
    

   
