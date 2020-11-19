package com.ezeu.test;


import com.ezeu.seller.ChildVendingMachine;
import com.ezeu.seller.VendingItem;
import com.ezeu.seller.VendingMachine;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class VendingMachineTest {
    @Test
    public void arraylisttesting() {

       ChildVendingMachine childVendingMachine = new ChildVendingMachine();
      int sizee= childVendingMachine.items.size();
       childVendingMachine.deleteItem(0);
       assertEquals(0,sizee-1);

    }
    @Test
    public void testig(){
        ArrayList<VendingItem> value = VendingMachine.instance.items;
        int size = value.size();
        assertEquals(1, size);
    }

}