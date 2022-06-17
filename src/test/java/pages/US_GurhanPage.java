package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_GurhanPage  {

    public US_GurhanPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//*[@alt='Website for automation practice']")
    public WebElement homepageIsDisplayed;

    @FindBy(xpath = "//*[.='Subscription']")
    public WebElement SubscriptionText;

    @FindBy(id="susbscribe_email")
    public WebElement emailAddressBox;

    @FindBy(id="subscribe")
    public WebElement arrowButton;

    @FindBy(xpath = "//*[.='You have been successfully subscribed!']")
    public WebElement successfullySubscribedMessage;

    @FindBy(xpath = "//*[.='Subscription']")
    public WebElement subscriptionText;

    @FindBy(xpath = "(//*[.=' Cart'])[1]")
    public WebElement cartButton;

    @FindBy(xpath = "(//a[@data-product-id='1'])[2]")
    public WebElement firstProduct;

    @FindBy(xpath = "//*[.='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "(//a[@data-product-id='1'])[2]")
    public WebElement secondProduct;

//----------------------------US-12---------------------

    @FindBy(xpath = "(//*[.='Blue Top'])[2]")
    public WebElement firstProductCheck;

    @FindBy(xpath = "(//*[.='Men Tshirt'])[2]")
    public WebElement secondProductCheck;

    @FindBy(xpath = "(//td[@class='cart_price'])[1]")
    public WebElement firstProductPrice;

    @FindBy(xpath = "(//td[@class='cart_price'])[2]")
    public WebElement secondProductPrice;

    @FindBy(xpath = "(//button[@class='disabled'])[1]")
    public WebElement firstProductQuantity;

    @FindBy(xpath = "(//button[@class='disabled'])[2]")
    public WebElement secondProductQuantity;

    @FindBy(xpath = "(//p[@class='cart_total_price'])[1]")
    public WebElement firstProductTotal;

    @FindBy(xpath = "(//p[@class='cart_total_price'])[2]")
    public WebElement secondProductTotal;
}


