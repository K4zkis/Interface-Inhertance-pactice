package com.fdmgroup.ComparisonsExercises;

import java.util.Objects;

public class Book implements Comparable<Book>{
	private String title;
	private int isbn;
	private Double price;
	private int numberOfPages;
	private Double rating;
	
	public Book(String title, int isbn, Double price, int numberOfPages, Double rating) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", price=" + price + ", numberOfPages=" + numberOfPages
				+ ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn, numberOfPages, price, rating, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return isbn == other.isbn && numberOfPages == other.numberOfPages && Objects.equals(price, other.price)
				&& rating == other.rating && Objects.equals(title, other.title);
	}

	@Override
	public int compareTo(Book o) {
		return 0;
	}
	
	
	
	
	

}
