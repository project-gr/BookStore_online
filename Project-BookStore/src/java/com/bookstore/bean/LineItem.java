/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.BookDAO;
import java.text.NumberFormat;

/**
 *
 * @author Ren
 */
public class LineItem{
	private int lineItemId;
	private int transactionId;
	private String isbn;
	private int quantity;
	private String title;
	
	
	
	public LineItem(int lineItemId, int transactionId, String isbn, int quantity, String title) {
		this.lineItemId = lineItemId;
		this.transactionId = transactionId;
		this.isbn = isbn;
		this.quantity = quantity;
		this.title = title;
	}

	public LineItem() {
		this.lineItemId = 0;
		this.transactionId = 0;
		this.isbn = "";
		this.quantity = 0;
		this.title = "";
	}

	public int getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(int lineItemId) {
		this.lineItemId = lineItemId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPrice() {
		double price = new BookDAO().getBook(isbn).getPrice();
		NumberFormat dm = NumberFormat.getCurrencyInstance();
		return dm.format(price);
	}
	
	public String getTotalPrice() {
		double price = this.quantity * new BookDAO().getBook(isbn).getPrice();
		NumberFormat dm = NumberFormat.getCurrencyInstance();
		return dm.format(price);
	}
	
	public double getTotalPriceDouble() {
		return this.quantity * new BookDAO().getBook(isbn).getPrice();
	}
	
	public boolean enoughInventory() {
		boolean retVal = true;
		if (quantity > new BookDAO().getBook(isbn).getInventory()) {
			retVal = false;
		}
		return retVal;
	}
	
	public void commitInventoryDecrement() {
		BookDAO bookDb = new BookDAO();
		BookBean book = bookDb.getBook(isbn);
		book.setInventory(book.getInventory() - quantity);
		bookDb.update(book);
	}
}