//package Hooks;
//
//import io.cucumber.java.Scenario;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import utilities.ConfigurationReader;
//import utilities.Driver;
//
//public class Hooks {
//    WebDriver driver;
//
//    @Before()
//    public void commonSteps(){
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////        driver.navigate().to("login_url");
//        //Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));
//
//       // Assert.assertTrue(autoExercisePage.automationExerciseWebelement.isDisplayed());
//    }
//    @After
//    public void tearDown (Scenario scenario){
//
//        if (scenario.isFailed()) {
//            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//
//            scenario.attach(screenshot, "image/png", "screenshots");
//        }
//
////        Driver.closeDriver();
//
//    }
//}
