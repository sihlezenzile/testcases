/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.testdemo;

/**
 *
 * @author 211282278
 */
public class ObjectsClass {

    public ObjectsClass() {
    }
    
    public String customer(String id)
    {
        if(id.equalsIgnoreCase("AD"))   
            return "EMPLOYEE";
        else
            return "CUSTOMER";
    }
}
