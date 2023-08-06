package com.fdmgroup.ComparisonsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) {
		Book book1 = new Book("Learn Java", 45678, 19.99, 500, 4.3);
		Book book2 = new Book("Learn UNIX", 65432, 17.5, 650, 3.9);
		Book book3 = new Book("Learn SQL", 87956, 9.75, 220, 4.4);
		Book book4 = new Book("Learn Agile", 35367, 25.5, 500, 4.4);
		Book book5 = new Book("Learn React", 55676, 29.75, 490, 4.8);
		Book book6 = new Book("Learn JavaScript", 34343, 14.99, 300, 4.4);
		Book book7 = new Book("Learn Python", 65767, 27.25, 500, 4.1);
		
		ArrayList<Book> bookShelf = new ArrayList<>();
		bookShelf.add(book1);
		bookShelf.add(book2);
		bookShelf.add(book3);
		bookShelf.add(book4);
		bookShelf.add(book5);
		bookShelf.add(book6);
		bookShelf.add(book7);
		
//		for (int i =0; i<bookShelf.size();i++)System.out.println(bookShelf.get(i));
//		System.out.println("------------------------------------------------------");
//		Collections.sort(bookShelf, new BookNameComparator());
//		for (int i =0; i<bookShelf.size();i++)System.out.println(bookShelf.get(i));
//		System.out.println("------------------------------------------------------");
//		Collections.sort(bookShelf, new BookPageComparator());
//		for (int i =0; i<bookShelf.size();i++)System.out.println(bookShelf.get(i));
//		System.out.println("------------------------------------------------------");
//		Collections.sort(bookShelf, new BookPageIsbnComparator());
//		for (int i =0; i<bookShelf.size();i++)System.out.println(bookShelf.get(i));
//		System.out.println("------------------------------------------------------");
//		Collections.sort(bookShelf, new BookRatingPriceComparator());
//		for (int i =0; i<bookShelf.size();i++)System.out.println(bookShelf.get(i));
//		System.out.println("------------------------------------------------------");
//		Collections.sort(bookShelf, new BookPriceComparator());
//		for (int i =0; i<bookShelf.size();i++)System.out.println(bookShelf.get(i));
//		System.out.println("------------------------------------------------------");
//		
//		
//		for (Book item:bookShelf)
//		{
//			System.out.println(item);
//		}
//		
		
		System.out.println("------------------------------------------------------");
		TreeSet<Book> bookSet = new TreeSet<>(new BookRatingPriceComparator());
		bookSet.addAll(bookShelf);
		
		for (Book item:bookSet)
		{
			System.out.println(item);
		}
		
		PriorityQueue<Double> doubles = prioritise(5.3,1.2,8.9,3.4);
		
		while (doubles.size() > 0) {
			System.out.println(doubles.poll());
		}
	}
	
	public static PriorityQueue<Double> prioritise(double... doubles) {
		PriorityQueue<Double> sorted = new PriorityQueue<Double>(1, Collections.reverseOrder());

		for (Double d : doubles) {
			sorted.add(d);
		}

		return sorted;

	}

}
