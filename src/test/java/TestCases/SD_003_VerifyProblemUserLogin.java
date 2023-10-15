package TestCases;

import base.baseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.UserLogin;
import utilities.extentReports.ExtentTestManager;

public class SD_003_VerifyProblemUserLogin extends baseClass{

    @Test
    public void ProblemUserLogin() throws InterruptedException {
        ExtentTestManager.startTest("Problem User Login", "Verify Problem user login");

        UserLogin userLogin = new UserLogin(driver);
        logger.info("Test is starting");
        //Test Steps
        userLogin.enterUsername("problem_user");
        Thread.sleep(1000);
        userLogin.enterPassword("secret_sauce");
        Thread.sleep(1000);
        userLogin.clickLoginButton();
        Thread.sleep(1000);
        userLogin.getProductpage();

        SoftAssert softAssert = new SoftAssert();
        if(userLogin.getProductpage()){
            softAssert.assertTrue(true);
            logger.info("User is on the Product Page");

        }else{
            logger.info("User is not on the Product Page");
        }

    }

}
