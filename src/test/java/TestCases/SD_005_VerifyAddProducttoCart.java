package TestCases;

import base.baseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.Products;
import pageObjects.UserLogin;
import utilities.extentReports.ExtentTestManager;


public class SD_005_VerifyAddProducttoCart extends baseClass{
    @Test
    public void addtoCart() throws InterruptedException {
        ExtentTestManager.startTest("Add to Cart", "Verify Add to Cart");


        UserLogin userLogin = new UserLogin(driver);

        userLogin.loginassert();
        //test steps
        userLogin.enterUsername("standard_user"); //For Valid User
        Thread.sleep(1000);
        userLogin.enterPassword("secret_sauce");
        Thread.sleep(1000);
        userLogin.clickLoginButton();
        Thread.sleep(1000);
        //Add to Cart
        Products products = new Products(driver);
        products.addtoCartButton();


    }
}
