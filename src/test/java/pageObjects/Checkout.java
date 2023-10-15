package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Checkout {
    private WebDriver driver;

    //Constructor
    public Checkout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "#first-name")
    private WebElement myfirstname;
    @FindBy(css = "#last-name")
    private WebElement mylastname;

    @FindBy(css = "#postal-code")
    private WebElement postalcode;

    @FindBy(css = "#continue")
    private WebElement checkContinue;
    @FindBy(css = "#finish")
    private WebElement checkFinish;
    @FindBy(css = "#cancel")
    private WebElement checkCancel;
    @FindBy(css = "#back-to-products")
    private WebElement backhome;

    public void inputFirstname(String myfirst){
        myfirstname.sendKeys(myfirst);

    }

    public void inputLastname(String mylast){
        mylastname.sendKeys(mylast);

    }
    public void postalCode(String postal){
        postalcode.sendKeys(postal);

    }

    public void continueCheck(){
       checkContinue.click();

    }
    public void finnishCheck(){
        checkFinish.click();

    }
    public void cancelCheck(){
        checkCancel.click();

    }
    public void clickBackhome(){
        backhome.click();

    }







}
