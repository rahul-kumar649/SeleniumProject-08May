package com.OpenKart.utilities;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListenerClass implements ITestListener
 {

	ExtentSparkReporter htmlReporter;
    ExtentReports reports;
    ExtentTest test;

    public void configureReport() {
        htmlReporter = new ExtentSparkReporter("ExtentListenerReport.html");
        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);
        //Read Config object
        ReadConfig readconfig = new ReadConfig();
        // Add system information/environment info to reports
        reports.setSystemInfo("Machine", "testpc01");
        reports.setSystemInfo("OS", "Windows 11");
        reports.setSystemInfo("browser", readconfig.getbrowser());
        reports.setSystemInfo("user name", "Rahul Kumar");

        // Configuration to change look and feel of report
        htmlReporter.config().setDocumentTitle("Extent Listener Report Demo");
        htmlReporter.config().setReportName("This is my First Report");
        htmlReporter.config().setTheme(Theme.DARK);
    }

    public void onStart(ITestContext Result) {
        configureReport();
        System.out.println("On Start method invoked....");
    }

    public void onFinish(ITestContext Result) {
        System.out.println("On Finished method invoked....");
        reports.flush();
    }

    public void onTestFailure(ITestResult Result) {
        System.out.println("Name of test method failed: " + Result.getName());
        test = reports.createTest(Result.getName());
        //test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is: " + Result.getName(), com.aventstack.extentreports.markuputils.ExtentColor.RED));
        String screenShotPath = System.getProperty("user.dir") + "\\Screenshots\\" + Result.getName() + ".png";
        File screenShotFile = new File(screenShotPath);

        if (screenShotFile.exists()) {
            test.fail("Captured Screenshot is below:" + test.addScreenCaptureFromPath(screenShotPath));
        }

    }

    public void onTestSkipped(ITestResult Result) {
        System.out.println("Name of test method skipped: " + Result.getName());
        test = reports.createTest(Result.getName());
        //test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skip test case is: " + Result.getName(), com.aventstack.extentreports.markuputils.ExtentColor.ORANGE));
    }

    public void onTestStart(ITestResult Result) {
        System.out.println("Name of test method started: " + Result.getName());
    }

    public void onTestSuccess(ITestResult Result) {
        System.out.println("Name of test method successfully executed: " + Result.getName());
        test = reports.createTest(Result.getName());
        //test.log(Status.PASS, MarkupHelper.createLabel("Name of the passed test case is: " + Result.getName(), com.aventstack.extentreports.markuputils.ExtentColor.GREEN));
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
        // This can be implemented if needed
    }
}



