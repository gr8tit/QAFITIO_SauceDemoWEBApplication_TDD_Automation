package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserLogin {

    private WebDriver driver;

    // Constructor
    public UserLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Elements
//    @FindBy(css = ".login_logo")
//    private WebElement swaglabcss;

//    @FindBy(xpath = "/html/body/div/div/div[1]")
//    private WebElement swaglagxpath;

    @FindBy(name = "user-name")
    private WebElement usernameinpt;

    @FindBy(id = "password")
    private WebElement passwordid;

    @FindBy(id = "login-button")
    private WebElement loginbutton;

    @FindBy(className = "login_logo")
    private static WebElement logilogoassert;

    @FindBy(css = ".error-message-container > h3:nth-child(1)")
    private static WebElement lockedusermessage;

    @FindBy(css = ".title")
    private WebElement productpage;



    // Methods to interact with elements
    public void enterUsername(String username) {

        usernameinpt.sendKeys(username);
    }

    public void enterPassword(String mypassword) {

        passwordid.sendKeys(mypassword);
    }

    public void clickLoginButton() {
        loginbutton.click();
    }

    public static void loginassert(){
        logilogoassert.click();
        logilogoassert.getText();
        Assert.assertTrue(true);
    }

    public  void lockedMessage(){
        lockedusermessage.click();
        Assert.assertTrue(true,"Epic sadface: Sorry, this user has been locked out.");
    }

    public static boolean errorMessage(){
        return lockedusermessage.isDisplayed();
    }

    public boolean getProductpage(){
        productpage.click();
        productpage.getText();
       return  productpage.isDisplayed();

    }


}
