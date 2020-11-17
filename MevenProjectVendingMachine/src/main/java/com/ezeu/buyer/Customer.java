package com.ezeu.buyer;

import com.ezeu.seller.VendingItem;
import com.ezeu.seller.VendingMachine;

import java.util.Scanner;

public class Customer {

    private VendingMachine vendingMachine;

    public Customer() {
        this.vendingMachine = VendingMachine.getInstance();
    }

    public void getItemFromVendingMachine() {
        System.out.println(vendingMachine);
        System.out.println("Choose item number and the Quantity:");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt() - 1;
        int qty = sc.nextInt();
        VendingItem item = this.vendingMachine.getItem(index, qty);
        System.out.println("You have selected this item " + item.getItemname());

        int cost = item.getPrice() * qty;
        System.out.println("pay the bill  " + cost+ "$");
        int bill = sc.nextInt();
        if (bill < cost) {
            System.out.println("u have low balance");
        } else if (bill > cost) {
            int rembal = bill - cost;
            System.out.println("take  "+  item.getItemname() + "and  take change: " + rembal);
        } else {
            System.out.println("take it  " + item.getItemname());
        }
    }
}
