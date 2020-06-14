/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;

/**
 *
 * @author Ren
 */
public class Cart{
	private ArrayList<LineItem> items;

	public Cart(ArrayList<LineItem> items) {
		this.items = items;
	}

	public Cart() {
		this.items = new ArrayList<LineItem>();
	}

	public ArrayList<LineItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<LineItem> items) {
		this.items = items;
	}

	public void add(LineItem item) {
        //If the item already exists in the cart, only the quantity is changed.
        String code = item.getIsbn();
        int quantity = item.getQuantity();
        for (int i = 0; i<items.size(); i++) {
            LineItem lineItem = items.get(i);
            if (lineItem.getIsbn().equals(code)) {
                lineItem.setQuantity(quantity);
                return;
            }
        } 
        items.add(item);
    }
	
	// Used to empty cart after order has been processed
	public void removeAllItems() {
		items = new ArrayList<LineItem>();
	}
    
    public void remove(LineItem item) {
        String code = item.getIsbn();
        for (int i = 0; i<items.size(); i++) {
            LineItem lineItem = items.get(i);
            if (lineItem.getIsbn().equals(code)) {
                items.remove(i);
                return;
            }
        }
    }	
}

