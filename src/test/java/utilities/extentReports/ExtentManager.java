package utilities.extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports createExtentReports(){
        ExtentSparkReporter reporter = new ExtentSparkReporter("extent-reports/report.html");
        reporter.config().setReportName("SauceDemo Regression Test Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Test Name","SauceDemo Automation");
        extentReports.setSystemInfo("Author", "Temitope Oyedemi");
        return extentReports;

    }

}
