package com.party;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
@Test(dependsOnGroups = {"start"})
public class LoginTest {

    @Test
    public void pageTestCase01()
    {
        assertTrue( true );
    }
    @Test
    public void pageTestCase02()
    {
        assertTrue( true );
    }
    @Test
    public void pageTestCase03()
    {
        assertTrue( true );
    }
}
