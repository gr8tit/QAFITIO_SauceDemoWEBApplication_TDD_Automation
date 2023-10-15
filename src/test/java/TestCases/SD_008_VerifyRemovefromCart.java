package TestCases;

import base.baseClass;
import org.testng.annotations.Test;
import pageObjects.Products;
import pageObjects.UserLogin;
import utilities.extentReports.ExtentTestManager;
public class SD_008_VerifyRemovefromCart extends baseClass {

    @Test
    public void RemovefrCart() throws InterruptedException {
        ExtentTestManager.startTest("Remove Product from Cart", "Verify User can remove product from Cart");

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
        //Click on Cart
        products.clickCart();
        Thread.sleep(1000);
        //Remove from Cart
        products.removefromCart();
        Thread.sleep(1000);


    }
}
