/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.testdeno;

import com.zenzile.testdemo.Numeral;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author 211282278
 */
public class FloatingPointTest {
    private Numeral num;
    public FloatingPointTest() {
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
    public void testFloat()
    {
        num = new Numeral();
        
        Assert.assertEquals(num.taxAmount(20.00f), 10.00f, 10.100f);
    }
    
}
