package TestCases;

import base.baseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.Products;
import pageObjects.UserLogin;
import utilities.extentReports.ExtentTestManager;


public class SD_013_VerifySortNameLowtoHigh extends baseClass{

    @Test
    public void SortNameLowtoHigh() throws InterruptedException {
        ExtentTestManager.startTest("VerifySortPriceLowtoHigh", "Verify User can sort products price from Low to High");

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

        Products products = new Products(driver);
        products.sortContainer();
        Thread.sleep(1000);
        products.sortByPriceLH();
        Thread.sleep(1000);

    }

}
