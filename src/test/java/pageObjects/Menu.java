package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

    private WebDriver driver;

    //Constructor
    public Menu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "#react-burger-menu-btn")
    private WebElement selectMenu;

    @FindBy(css = "#about_sidebar_link")
    private WebElement aboutMenu;

    @FindBy(css = "#logout_sidebar_link")
    private  WebElement logout;

    @FindBy(id = "react-burger-cross-btn")
    private WebElement closeMenu;

    public void clickMenu(){
        selectMenu.click();
    }
    public void clickAbout(){
        aboutMenu.click();
    }
    public void logoutUser(){
        logout.click();
    }
    public void menuClose(){
        closeMenu.click();
    }

}
