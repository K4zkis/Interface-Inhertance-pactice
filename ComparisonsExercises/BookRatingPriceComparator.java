package com.fdmgroup.ComparisonsExercises;

import java.util.Comparator;

public class BookRatingPriceComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		if (!o1.getRating().equals(o2.getRating()))
			return o1.getRating().compareTo(o2.getRating());
		return (o1.getPrice().compareTo(o2.getPrice()))*-1;
	}

}
