package com.bridgelabz.DesignPattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop 
{
	private String ShopName;
	List<Book> books=new ArrayList<>();
	public String getShopName() {
		return ShopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
}
