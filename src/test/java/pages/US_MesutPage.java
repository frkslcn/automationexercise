package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_MesutPage {

    public US_MesutPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Products']")
    public WebElement productsButton;

    @FindBy(xpath = "//*[.='Brands']")
    public WebElement brandsButton;

    @FindBy(xpath = "//div[@class='brands-name']//ul//li[1]")
    public WebElement poloBrandName;

    @FindBy(xpath = "//div[@class='brands-name']//ul//li[2]")
    public WebElement hmBrandName;


}
