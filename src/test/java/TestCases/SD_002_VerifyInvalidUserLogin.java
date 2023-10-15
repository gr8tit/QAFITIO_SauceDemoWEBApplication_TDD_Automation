package TestCases;

import base.baseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.UserLogin;
import utilities.extentReports.ExtentTestManager;

public class SD_002_VerifyInvalidUserLogin extends baseClass{

    @Test
    public void invalidUserLogin() throws InterruptedException{
        ExtentTestManager.startTest("Invalid User Login", "Verify locked_out_user login");

        UserLogin userLogin = new UserLogin(driver);
        logger.info("Attempting Login");
        userLogin.loginassert();
        //Test Steps
        userLogin.enterUsername("locked_out_user");
        Thread.sleep(1000);
        userLogin.enterPassword("secret_sauce");
        Thread.sleep(1000);
        userLogin.clickLoginButton();
        Thread.sleep(1000);
//        userLogin.lockedMessage();
//        Thread.sleep(1000);

        SoftAssert softassert = new SoftAssert();
//        if (Boolean.toString(userLogin.errorMessage()).equals(true)) {
        if (userLogin.errorMessage()) {
            softassert.assertTrue(true);
            logger.info("User is locked out");
            ExtentTestManager.getTest().pass("Test case executed successfully.");
        } else {
            logger.info("Test Failed! ");
            ExtentTestManager.getTest().fail("Test case failed.");
            softassert.fail("Assertion for page title failed."); // Mark the assertion as failed in SoftAssert
        }
//
    }

}
