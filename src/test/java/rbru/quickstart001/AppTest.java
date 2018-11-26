package rbru.quickstart001;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    @Test(priority = -1)
    public void loginTest()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 0, dependsOnMethods = {"loginTest"})
    public void profileTest()
    {
        Assert.assertTrue(true);

    }

    @Test(priority = 5, groups = {"pageTests"}, dependsOnMethods = {"loginTest"})
    public void pageTestCase01()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 5, groups = {"pageTests"}, dependsOnMethods = {"loginTest"})
    public void pageTestCase02()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 5, groups = {"pageTests"}, dependsOnMethods = {"loginTest"})
    public void pageTestCase03()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 100, dependsOnMethods = {"loginTest"})
    public void logoffTest()
    {
        Assert.assertTrue(true);
    }


}
