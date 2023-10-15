package TestCases;

import base.baseClass;
import org.testng.annotations.Test;
import pageObjects.Products;
import pageObjects.UserLogin;
import utilities.extentReports.ExtentTestManager;

public class SD_007_VerifyRemoveProductfromInventory extends baseClass{
    @Test
    public void RemovefrInventory() throws InterruptedException {
        ExtentTestManager.startTest("Remove Product from Inventory", "Verify User can remove product from Inventory");

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
        //Add product
        products.addtoCartButton();
        Thread.sleep(1000);
        //Remove product from inventory
        products.removefromInventory();
        Thread.sleep(1000);


    }

}
