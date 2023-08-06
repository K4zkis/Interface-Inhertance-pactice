package com.fdmgroup.ComparisonsExercises;

import java.util.Comparator;

public class BookPageComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return ((Integer)o1.getNumberOfPages()).compareTo((Integer)o2.getNumberOfPages());
		
	}
	

}
