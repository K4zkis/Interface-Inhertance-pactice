package com.fdmgroup.GenericsExercise;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
//	
//		List<String> list1 = new ArrayList<>();
//		List<Integer> list2 = new ArrayList<>();
//		List<Book> list3 = new ArrayList<>();
//		List list4 = new ArrayList<>(); // this allows the adding of any Type
//		
//		list1.add("lkhsd");
//		list4.add(10);
//		list4.add("string");
//		list4.add(new Book());
		
		//-----------------------------------------------------------------------------------------
		// there is no type Safety in this
		// ----> with generics we can assure an object can only have certain types in it
		
		// now the booksstore expands and offers toys -> we need a toybasket to hold the toy items as 
		// the bookbasket only holds books ---> but this generates a lot of replicated code
		// what happens if we let a basket array hold the type Object? -> commented in ToyBasket
		// in short terrible idea -> now Basket will be modified to use Generics 
		//and the old basket will be commented out
		Basket<Book> bookBasket = new Basket<>();
		Basket<Toy> toyBasket = new Basket<>();
		
		toyBasket.addItem(new Toy());
		//toyBasket.addItem(new Book()); not possible
		
		bookBasket.addItem(new Book());
		//bookBasket.addItem(new Toy()); not possible as it is declared as holding Book objects
		
		// now we can decide at runtime which types can be held by the List
		
		
		// We can also create a GenericClass which can give something multiple classes 
		// through inheritance
		
		//not possible declarations:
		//GenericClass<String> gc = new GenericClass();
		//GenericClass<Integer> gc = new GenericClass();
		//GenericClass<Double> gc = new GenericClass();
		//GenericClass<Book> gc = new GenericClass();
		
		
//		GenericClass gc = new GenericClass();
//		gc.setVar1("String");//string
//		gc.setVar1(1);// integer
//		gc.setVar1(1.1); //double
//		gc.setVar1(new Book()); // Book
		
		// So now we can give the Generic inheritance to restrict the possible types
		
		GenericClass<Double, Book> gc = new GenericClass();
		gc.setVar1(1.1); //double
		gc.setVar2(new Book()); // Book
		
		
		
		
	}

}
