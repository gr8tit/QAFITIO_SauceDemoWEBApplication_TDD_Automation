package TestCases;

import base.baseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.Checkout;
import pageObjects.Menu;
import pageObjects.Products;
import pageObjects.UserLogin;
import utilities.extentReports.ExtentTestManager;

public class SD_017_VerifyAboutMenu extends baseClass{

    @Test
    public void VerifyAboutMenu() throws InterruptedException {
        ExtentTestManager.startTest("VerifyAboutMenu", "Verify that user can click on ABOUT Menu");

        UserLogin userLogin = new UserLogin(driver);
        logger.info("Attempting Login");
        //test steps
        userLogin.enterUsername("standard_user"); //For Valid User
        Thread.sleep(1000);
        userLogin.enterPassword("secret_sauce");
        Thread.sleep(1000);
        userLogin.clickLoginButton();
        Thread.sleep(1000);
        logger.info("User has Logged in");

        //Menu
        Menu menu = new Menu(driver);
        menu.clickMenu();
        Thread.sleep(1000);
        menu.clickAbout();
        Thread.sleep(1000);
        driver.navigate().back();
    }
}
