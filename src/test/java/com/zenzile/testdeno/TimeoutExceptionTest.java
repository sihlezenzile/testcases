/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenzile.testdeno;

import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author bakhe
 */
public class TimeoutExceptionTest {
    
    public TimeoutExceptionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test(timeout=1000) 
    public void timeoutOutExceptionTest() { 
        //Class<TimeoutException> expected
        int [] a1 = {4,6,2,8,10};
        int [] a2 = {4,6,2,8,10};
        Assert.assertArrayEquals(a1, a2);
     } 

}
