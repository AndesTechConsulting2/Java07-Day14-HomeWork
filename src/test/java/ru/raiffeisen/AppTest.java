package ru.raiffeisen;


import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void loginTest(ITestContext ctx) {

        System.out.println("Method name = " + Thread.currentThread().getStackTrace()[1].getMethodName() + " "
                + "Test name = " + ctx.getCurrentXmlTest().getName());
        Assert.assertTrue(true);

    }


    @Test(priority = -1, dependsOnMethods = {"loginTest"})
    public void profileTest(ITestContext ctx) {

        System.out.println("Method name = " + Thread.currentThread().getStackTrace()[1].getMethodName() + " "
                + "Test name = " + ctx.getCurrentXmlTest().getName());
        Assert.assertTrue(true);

    }

    @Test(groups = {"pageTests"}, dependsOnMethods = {"loginTest"})
    public void pageTestCase01(ITestContext ctx) {

        System.out.println("Method name = " + Thread.currentThread().getStackTrace()[1].getMethodName() + " "
                + "Test name = " + ctx.getCurrentXmlTest().getName());
        Assert.assertTrue(true);

    }

    @Test(groups = {"pageTests"}, dependsOnMethods = {"loginTest"})
    public void pageTestCase02(ITestContext ctx) {

        System.out.println("Method name = " + Thread.currentThread().getStackTrace()[1].getMethodName() + " "
                + "Test name = " + ctx.getCurrentXmlTest().getName());
        Assert.assertTrue(true);

    }

    @Test(groups = {"pageTests"}, dependsOnMethods = {"loginTest"})
    public void pageTestCase03(ITestContext ctx) {

        System.out.println("Method name = " + Thread.currentThread().getStackTrace()[1].getMethodName() + " "
                + "Test name = " + ctx.getCurrentXmlTest().getName());
        Assert.assertTrue(true);

    }

    @Test(priority = 1, dependsOnMethods = {"loginTest"})
    public void logoffTest(ITestContext ctx) {

        System.out.println("Method name = " + Thread.currentThread().getStackTrace()[1].getMethodName() + " "
                + "Test name = " + ctx.getCurrentXmlTest().getName());
        Assert.assertTrue(true);

    }

}
