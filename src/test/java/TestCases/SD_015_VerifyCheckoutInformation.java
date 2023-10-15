package TestCases;

import base.baseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.Checkout;
import pageObjects.Products;
import pageObjects.UserLogin;
import utilities.extentReports.ExtentTestManager;

public class SD_015_VerifyCheckoutInformation extends baseClass{

    @Test
    public void CheckoutInformation() throws InterruptedException {
        ExtentTestManager.startTest("VerifyCheckoutInformation", "Verify User can checkout and submit their information");

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


        //Add to Cart
        Products products = new Products(driver);
        products.addtoCartButton();
        Thread.sleep(1000);
        products.clickCart();
        Thread.sleep(1000);
        //Checkout
        products.ClickcheckoutButton();
        Thread.sleep(1000);

        //CheckoutInformation
        Checkout checkout = new Checkout(driver);
        checkout.inputFirstname("Tester");
        Thread.sleep(1000);
        checkout.inputLastname("Test");
        Thread.sleep(1000);
        checkout.postalCode("1010");
        Thread.sleep(1000);
        checkout.continueCheck();
        Thread.sleep(1000);
//        checkout.cancelCheck();
        checkout.finnishCheck();
        Thread.sleep(1000);
        checkout.clickBackhome();
        Thread.sleep(1000);

    }
    }
