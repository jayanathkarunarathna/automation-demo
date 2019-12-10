package com.wiley.qe;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WileyTestLIstner implements ITestListener {

    public ExtentTest test;
    public ExtentReports report;

    public void onTestStart(ITestResult result) {
        test = report.startTest(result.getMethod().getDescription());
    }

    public void onTestSuccess(ITestResult result) {
        test.log(LogStatus.PASS, "Test Success!");
    }

    public void onTestFailure(ITestResult result) {
        test.log(LogStatus.FAIL, "Test Failed!" );
    }

    public void onTestSkipped(ITestResult result) {
        test.log(LogStatus.SKIP, "Test Skipped!");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {
        test.log(LogStatus.FAIL, "Test Failed!");
    }

    public void onStart(ITestContext context) {
        report = new ExtentReports(System.getProperty("user.dir") + "/target/ExtentReport.html");
    }

    public void onFinish(ITestContext context) {
        report.endTest(test);
        report.flush();
    }
}
