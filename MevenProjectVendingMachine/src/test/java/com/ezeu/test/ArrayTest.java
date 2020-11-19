package com.ezeu.test;


import com.ezeu.seller.VendingItem;
import com.ezeu.seller.VendingMachine;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ArrayTest {
    @Test
    public void ArrayTest(){
        ArrayTest arrayTest=new ArrayTest();
        ArrayList<VendingItem> value= VendingMachine.instance.items;
        int size=value.size();
        assertEquals(1,size);
    }
}

