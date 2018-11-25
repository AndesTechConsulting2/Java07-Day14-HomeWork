package ru.raiffeisen.training;


import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
public class AppTest {

    @Test(priority = -10)
    public void loginTest() {
        System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName() +"Thread id: "+Thread.currentThread().getId());
        Assert.assertTrue(true);
    }

    @Test(priority = -9, dependsOnMethods = "loginTest")
    public void profileTest() {
        System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName()+"Thread id: "+Thread.currentThread().getId());
        Assert.assertTrue(true);
    }

    @Test(groups = "pageTest", priority = 3, dependsOnMethods = "loginTest")
    public void pageTestCase01() {
        System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName()+"Thread id: "+Thread.currentThread().getId());
        Assert.assertTrue(true);
    }

    @Test(groups = "pageTest", priority = 3, dependsOnMethods = "loginTest")
    public void pageTestCase02() {
        System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName()+"Thread id: "+Thread.currentThread().getId());
        Assert.assertTrue(true);
    }

    @Test(groups = "pageTest", priority = 3, dependsOnMethods = "loginTest")
    public void pageTestCase03(ITestContext ctx) {
        System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName()+"Thread id: "+Thread.currentThread().getId());
        Assert.assertTrue(true);
    }

    @Test(priority = 5, dependsOnMethods = "loginTest")
    public void logoffTest() {
        System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName()+"Thread id: "+Thread.currentThread().getId());
        Assert.assertTrue(true);
    }

}
