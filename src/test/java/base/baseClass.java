package base;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.BeforeClass;
import utilities.ReadConfig;

import java.util.concurrent.TimeUnit;

public class baseClass {

    public static ReadConfig readConfig = new ReadConfig();
    public static String baseURL = readConfig.getURL();
    public static String username = readConfig.getUsername();
    public static String password = readConfig.getPassword();

    public static WebDriver driver;
    public static org.apache.log4j.Logger logger;



    // Constructor to initialize the WebDriver
    @BeforeClass()
    public  void setup(){
        System.setProperty("webdriver.gecko.driver", "/Users/temitopeoyedemi/Documents/QAfit.io/Automation/AutomationClass_Setup/Drivers/geckodriver");
        driver = new FirefoxDriver();

        // Initialize Logger
        logger= org.apache.log4j.Logger.getLogger("AutomationClass_Setup");// Project Name

        PropertyConfigurator.configure("log4j.properties");
        logger.debug("Debug logging has started");
        driver.get(baseURL);
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    // Method to navigate to the base URL
//    public void navigateToBaseURL() {
//        driver.get(baseURL);
//    }

    // Method to close the WebDriver
//    public void closeDriver() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
