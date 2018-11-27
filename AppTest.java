package ru.raiffeisen.mikhaylova;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test(priority = 0)
    public static void loginTest() {
        Assert.assertTrue(true);
    }

    @Test(priority = 1, dependsOnMethods = {"loginTest"})
    public static void profileTest() {
        Assert.assertTrue(true);
    }

    @Test(priority = 1, groups = {"pageTests"}, dependsOnMethods = {"loginTest"})
    public static void pageTestCase01() {
        Assert.assertTrue(true);
    }

    @Test(priority = 0, groups = {"pageTests"}, dependsOnMethods = {"loginTest"})
    public static void pageTestCase02() {
        Assert.assertTrue(true);
    }

    @Test(priority = 2, groups = {"pageTests"}, dependsOnMethods = {"loginTest"})
    public static void pageTestCase03() {
        Assert.assertTrue(true);
    }

    @Test(priority = 3, dependsOnMethods = {"loginTest"})
    public static void logOffTest() {
        Assert.assertTrue(true);
    }
}
