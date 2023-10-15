package TestCases;

import base.baseClass;
import org.testng.annotations.Test;
import pageObjects.Products;
import pageObjects.UserLogin;
import utilities.extentReports.ExtentTestManager;

public class SD_006_VerifyClickonCart extends baseClass {

    @Test
    public void Clickcart() throws InterruptedException {
        ExtentTestManager.startTest("Click on Cart", "Verify User can Click on Cart");


        UserLogin userLogin = new UserLogin(driver);

        userLogin.loginassert();
        //test steps
        userLogin.enterUsername("standard_user"); //For Valid User
        Thread.sleep(1000);
        userLogin.enterPassword("secret_sauce");
        Thread.sleep(1000);
        userLogin.clickLoginButton();
        Thread.sleep(1000);

        //Add product to cart
        Products products = new Products(driver);
        products.addtoCartButton();
        Thread.sleep(1000);
        products.clickCart();
        Thread.sleep(1000);
    }
}
