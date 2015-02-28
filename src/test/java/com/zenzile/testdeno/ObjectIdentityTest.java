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
public class ObjectIdentityTest {
    
    private ObjectsClass obj1;
    private ObjectsClass obj2;
    
    public ObjectIdentityTest() {
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
    public void identityTest()
    {
        obj1 = new ObjectsClass();
        obj2 = new ObjectsClass();
        
        Assert.assertSame(obj1, obj1);
    }
}
