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






}
