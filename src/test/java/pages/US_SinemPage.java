package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_SinemPage {
    public US_SinemPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath="//a[normalize-space()='Contact us']")
    public WebElement contactUs;

    @FindBy(xpath="//h2[normalize-space()='Get In Touch']")
    public WebElement getInTouch;

    @FindBy(xpath="//input[@name='name']")
    public WebElement nameTextBox;

    @FindBy(xpath="(//input[@type='email'])[1]")
    public WebElement emailTextBox;

    @FindBy(xpath="//input[@name='subject']")
    public WebElement subjectTextBox;

    @FindBy(xpath="//textarea[@id='message']")
    public WebElement messageBox;

    @FindBy(xpath="//input[@name='upload_file']")
    public WebElement uploadFile;

    @FindBy(xpath="//div[@class='status alert alert-success']")
    public WebElement successAlert;

    @FindBy(xpath="//input[@name='submit']")
    public WebElement submitButton;

    @FindBy(xpath="//a[@class='btn btn-success']")
    public WebElement homeButton;

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement automationExerciseImage;

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement signUpLogIn;

    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    public WebElement loginToYourAccountText;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailLoginTextBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//li[9]//a[1]")
    public WebElement loggedInAs;
    //@FindBy(xpath = "//*[@class='fa fa-user']")
    //public WebElement loggedInAsUsername;

    //@FindBy(xpath = "//a[normalize-space()='Logout']")
    //public WebElement logoutButton;
    @FindBy(xpath="//i[@class='fa fa-lock']")
    public WebElement logout;

    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    public WebElement newUserSignUpText;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameNewUserTextBox;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailNewUserTextBox;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    public WebElement signUpNewUser;

    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    public WebElement emailAlreadyExistAlert;



}
