package com.fdmgroup.interfaceExercises;

public class ReadyMeal implements FoodItem,BasketItem{
	
private String cuisineType;
private String name;
private double price;
private int calories;

@Override
public void setName(String name) {
	this.name = name;
	
}

@Override
public String getName() {
	return this.name;
}

@Override
public void setPrice(double price) {
	this.price = price;
	
}

@Override
public double getPrice() {
	return this.price;
}

@Override
public int getCalories() {
	return this.calories;
}

@Override
public void setCalories(int calories) {
	this.calories = calories;
	
}

public String getCuisineType() {
	return cuisineType;
}

public void setCuisineType(String cuisineType) {
	this.cuisineType = cuisineType;
}


}
