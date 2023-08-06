package com.fdmgroup.ComparisonsExercises;

import java.util.Comparator;

public class BookPageIsbnComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getNumberOfPages()!=o2.getNumberOfPages())
			return o1.getNumberOfPages()-o2.getNumberOfPages();
		return o1.getIsbn()-o2.getIsbn();
	}

}
