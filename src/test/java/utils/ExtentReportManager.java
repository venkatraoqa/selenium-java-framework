package utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    public static ExtentReports extent;
    public static ExtentTest test;

    public static void initReport() {

        ExtentSparkReporter spark = new ExtentSparkReporter("reports/extentReport.html");

        spark.config().setReportName("Automation Report");
        spark.config().setDocumentTitle("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(spark);

        extent.setSystemInfo("Tester", "Venkat");
    }

    public static void createTest(String testName) {
        test = extent.createTest(testName);
    }

    public static void logPass(String message) {
        test.pass(message);
    }

    public static void logFail(String message) {
        test.fail(message);
    }

    public static void logSkip(String message) {
        test.skip(message);
    }

    public static void flushReport() {
        extent.flush();
    }
}