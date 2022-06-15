package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_GurhanPage {

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


}


