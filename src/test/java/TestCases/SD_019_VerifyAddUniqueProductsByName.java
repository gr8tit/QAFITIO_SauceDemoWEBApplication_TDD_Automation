package TestCases;

import base.baseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.Products;
import pageObjects.UserLogin;
import utilities.extentReports.ExtentTestManager;

public class SD_019_VerifyAddUniqueProductsByName extends baseClass {
    @Test
    public void VerifyAddUniqueProductsByName() throws InterruptedException {
        ExtentTestManager.startTest("VerifyAddUniqueProductsByName", "Verify that user select any Product");

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
        products.addproducttoCart("Sauce Labs Bolt T-Shirt");
        Thread.sleep(1000);

        SoftAssert softAssert = new SoftAssert();
        if(Boolean.toString(products.isProductAvailable("Sauce Labs Bolt T-Shirt")).equals(true)){
            softAssert.assertTrue(true);
            logger.info("Product is available");
            Thread.sleep(1000);

        }else{
            softAssert.assertTrue(false);
            logger.info("Product is not available");

        }

        products.addproducttoCart("Sauce Labs Bike Light");
        Thread.sleep(1000);



    }
}
