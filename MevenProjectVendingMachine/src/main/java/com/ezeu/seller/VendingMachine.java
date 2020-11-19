package com.ezeu.seller;

import com.ezeu.utils.InvalidItemOrQuantityException;

import java.util.ArrayList;

//import java.util.ArrayList;


public class VendingMachine {

    //Implementing  VendingMachine as a singleton object
    public static VendingMachine instance = new VendingMachine();

    public ArrayList<VendingItem> items;

    public VendingMachine() {
        this.items = new ArrayList<VendingItem>();
        this.items.add(new VendingItem("COKE", 10, 10 ));
    }

    public static VendingMachine getInstance()
    {
        return instance;
    }

    protected void addItem(VendingItem item) {
        items.add(item);
        // System.out.println("item added to the machine");
    }

    protected void deleteItem(int index) {
        items.remove(index);
    }

    public VendingItem getItem(int index, int qty) {
        if (index >= 0 && index < items.size() && items.get(index).getQuantity() >=qty) {
            VendingItem item = items.get(index);
            item.setQuantity(item.getQuantity() - qty);
            return new VendingItem(item);
        } else
            throw new InvalidItemOrQuantityException("Item number or the quantity is invalid " + index);
    }

    @Override
    public String toString() {
        StringBuilder resultBuilder = new StringBuilder("items are \n");
        for(int i = 0; i<items.size(); i++) {
            resultBuilder.append(i+1).append("  ").append(items.get(i)).append("\n");
        }
        String result = resultBuilder.toString();
        result += "\n";

        return result;
    }
}


