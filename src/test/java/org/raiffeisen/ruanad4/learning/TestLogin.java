package org.raiffeisen.ruanad4.learning;


import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestLogin
{

    @Test(groups = "LoginTest")
    public void loginTest(ITestContext ctx)
    {
        System.out.println("test: " + ctx.getCurrentXmlTest().getName() +
                " | method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }

    @Test(groups = "LoginTest", priority = 1, dependsOnMethods = "loginTest")
    public void profileTest(ITestContext ctx)
    {
        System.out.println("test: " + ctx.getCurrentXmlTest().getName() +
                " | method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Assert.assertTrue(true);
    }

    @Test(groups = "pageTests", priority = 2, dependsOnMethods = "loginTest")
    public void pageTestCase01(ITestContext ctx)
    {
        long id = Thread.currentThread().getId();

        System.out.println("test: " + ctx.getCurrentXmlTest().getName() +
                " | method: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " | id: " + id);

        Assert.assertTrue(true);
    }

    @Test(groups = "pageTests", priority = 2, dependsOnMethods = "loginTest")
    public void pageTestCase02(ITestContext ctx)
    {
        long id = Thread.currentThread().getId();

        System.out.println("test: " + ctx.getCurrentXmlTest().getName() +
                " | method: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " | id: " + id);

        Assert.assertTrue(true);
    }

    @Test(groups = "pageTests", priority = 2, dependsOnMethods = "loginTest")
    public void pageTestCase03(ITestContext ctx)
    {
        long id = Thread.currentThread().getId();

        System.out.println("test: " + ctx.getCurrentXmlTest().getName() +
                " | method: " + Thread.currentThread().getStackTrace()[1].getMethodName() + " | id: " + id);

        Assert.assertTrue(true);
    }

    @Test(groups = "LoginTest", priority = 3, dependsOnMethods = "loginTest")
    public void logoffTest(ITestContext ctx)
    {
        System.out.println("test: " + ctx.getCurrentXmlTest().getName() +
                " | method: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        Assert.assertTrue(true);
    }
}
