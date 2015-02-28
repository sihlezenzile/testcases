/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.testdeno;

import com.zenzile.testdemo.ObjectsClass;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 211282278
 */
public class Notnulltest {
    private ObjectsClass obj1;
    public Notnulltest() {
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
    
    @Test
    public void equalityTest()
    {
        obj1 = new ObjectsClass();
        String bk = obj1.customer("ID");
        
        Assert.assertNotNull(bk);
                
    }
}
