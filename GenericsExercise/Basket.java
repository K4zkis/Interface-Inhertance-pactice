package com.fdmgroup.GenericsExercise;

import java.util.ArrayList;
import java.util.List;

//public class Basket{ 
// List<Book> books = new ArrayList<>();
// 
// public List<Book> getBooksInBasket(){
//	 return books;
// }
// 
// public void addBook(Book book) {
//	 books.add(book);
// }
// the above code is obsolete and just for demonstration purposes for myself


public class Basket <T>{ 
	// convention is to use T for Type but essentially it is a variable that represents a real datatype
 List<T> items = new ArrayList<>();
 
 public List<T> getItemsInBasket(){
	 return items;
 }
 
 public void addItem(T item) {
	 items.add(item);
 }
}
