package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_HicretPage {

    public US_HicretPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//h2[@class='title text-center'])[2]")
    public WebElement recommendedItems;

//    @FindBy(xpath = "(//*[.='Add to cart'])[70] ")
//    public WebElement addToCartRecomment;

    @FindBy(xpath = "(//div[@class='single-products']//a)[72]")
    public WebElement addToCartRecomment;


    @FindBy(xpath = "//*[.='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//*[.='Stylish Dress']")
    public WebElement stylishDress;

}
