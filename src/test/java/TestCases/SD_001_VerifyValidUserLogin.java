package TestCases;

import base.baseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.UserLogin;
import utilities.extentReports.ExtentTestManager;

public class SD_001_VerifyValidUserLogin extends baseClass {

    @Test
    public void validUserlogin() throws InterruptedException {
        ExtentTestManager.startTest("Valid User Login", "Verify Valid user login");

        UserLogin userLogin = new UserLogin(driver);
        logger.info("Attempting Login");
        userLogin.loginassert();
        //test steps
        userLogin.enterUsername("standard_user"); //For Valid User
        Thread.sleep(1000);
        userLogin.enterPassword("secret_sauce");
        Thread.sleep(1000);
        userLogin.clickLoginButton();
        Thread.sleep(1000);
        logger.info("User has Logged in");



        SoftAssert softassert = new SoftAssert();
        if (driver.getTitle().equals("Swag Labs")) {
            logger.info("User now on the home Page");
            ExtentTestManager.getTest().pass("Test case executed successfully.");
        } else {
            logger.info("Test Failed! ");
            ExtentTestManager.getTest().fail("Test case failed.");
            softassert.fail("Assertion for page title failed."); // Mark the assertion as failed in SoftAssert
        }

        // You can add more assertions as needed
        softassert.assertTrue(true, "Login successful");

        softassert.assertAll();

        // This will mark the test as failed if any assertion failed


        ExtentTestManager.getTest().pass("Test case executed successfully");
        ExtentTestManager.getTest().fail("Test case fail");

//        logger.info("Completed Test 1");



    }
}
