package rbru.quickstart001;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("\nStart method <<" + iTestResult.getName()+">>");

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("Test <<" + iTestResult.getName()+ ">> passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Failed method <<" + iTestResult.getName()+">>");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Skipped methid <<" + iTestResult.getName()+">>");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

        System.out.println("\nStart Test <<" + iTestContext.getName()+">>");

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

        System.out.println("\nFinish Test <<" + iTestContext.getName()+">>");
    }
}
