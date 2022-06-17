package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_BunyaminPage {
   public US_BunyaminPage (){
       PageFactory.initElements(Driver.getDriver(), this);

   }
   @FindBy(xpath = "(//*[.='Test Cases'])[1]")
    public WebElement testCaseButtn;

   @FindBy(xpath = "(//*[.='Test Cases'])[2]")
    public WebElement testCaseText;

   @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[2]/a")
    public WebElement productsButton;

   @FindBy (xpath = "//*[@id='sale_image']")
    public WebElement allProductsPage;

   @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement productList;

   @FindBy(xpath = "(//*[.='View Product'])[1]")
    public WebElement viewProduct;

   //Automation Exercise - Product Details
    //Automation Exercise - All Products
  //: product name, category, price, availability, condition, brand

    @FindBy(xpath = "//*[.='Brand:']")
    public WebElement brand;
    @FindBy(xpath = "//*[.='Condition:']")
    public WebElement condition;
    @FindBy(xpath = "//*[.='Availability:']")
    public WebElement availibility;
    @FindBy(xpath = "//*[.='Category: Women > Tops']")
    public WebElement category;
    @FindBy(xpath = "//*[.='Rs. 500']")
    public WebElement price;
    @FindBy(xpath = "//*[.='Blue Top']")
    public WebElement name;


    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement searchButton;
    @FindBy(xpath = "//*[@id='submit_search']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@alt='ecommerce website products']")
    public WebElement displayedProduct01;

    @FindBy(xpath = "(//*[@alt='ecommerce website products'])[5]")
    public WebElement displayedProduct02;

    @FindBy(xpath = "(//*[@alt='ecommerce website products'])[3]")
    public WebElement displayedProduct03;

    //********************

    @FindBy(xpath = "//*[.='Subscription']")
    public WebElement Subscriptionbutton;

    @FindBy(xpath = "//*[@id='scrollUp']")
    public WebElement arrowUpButton;

    @FindBy(xpath = "((//h2)[1]")
    public WebElement automationengineerTex;


//*[@alt='ecommerce website products']

}
