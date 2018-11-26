package com.party;


import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import static org.testng.Assert.assertTrue;

public class PageTest
{
    @BeforeClass
    public void suiteName(ITestContext ctx){

        System.out.println("Suite name: " + ctx.getSuite().getName()+"\n");
    }
    @Test(groups = "start")
    public void loginTest()
    {
        assertTrue( true );
    }
    @Test(dependsOnGroups = {"start"})
    public void profileTest()
    {
        assertTrue( true );
    }
    @Test(dependsOnGroups = {"start"})
    public void logOffTest()
    {
        assertTrue( true );
    }
}
