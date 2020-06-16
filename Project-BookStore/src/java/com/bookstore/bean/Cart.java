/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.bean;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Cart {

    private ArrayList<OrderBean> items;

    public Cart(ArrayList<OrderBean> items) {
        this.items = items;
    }

    public Cart() {
        this.items = new ArrayList<OrderBean>();
    }

    public ArrayList<OrderBean> getItems() {
        return items;
    }

    public void setItems(ArrayList<OrderBean> items) {
        this.items = items;
    }

    public void add(OrderBean item) {
        //If the item already exists in the cart, only the quantity is changed.
        String code = item.getIsbn();
        int quantity = item.getQuantity();
        for (int i = 0; i < items.size(); i++) {
            OrderBean order = items.get(i);
            if (order.getIsbn().equals(code)) {
                order.setQuantity(quantity);
                return;
            }
        }
        items.add(item);
    }

    // Used to empty cart after order has been processed
    public void removeAllItems() {
        items = new ArrayList<OrderBean>();
    }

    public void remove(OrderBean item) {
        String code = item.getIsbn();
        for (int i = 0; i < items.size(); i++) {
            OrderBean order = items.get(i);
            if (order.getIsbn().equals(code)) {
                items.remove(i);
                return;
            }
        }
    }

}
