package TestCases;


import base.baseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.UserLogin;
import utilities.extentReports.ExtentTestManager;


public class SD_004_VerifyPerformanceGlitchUser  extends baseClass{

    @Test
    public  void performanceglitchuser() throws InterruptedException {
        ExtentTestManager.startTest("Performance Glitch User Login", "Verify performance glitch user login");

        UserLogin userLogin = new UserLogin(driver);
        logger.info("Test is starting");
        //Test Steps
        userLogin.enterUsername("performance_glitch_user");
        Thread.sleep(1000);
        userLogin.enterPassword("secret_sauce");
        Thread.sleep(1000);
        userLogin.clickLoginButton();
        Thread.sleep(1000);


    }


}
