package com.fdmgroup.CastingExercises;

public class Snack implements BasketItem,FoodItem{
private int fatContent;
private int sugarContent;
private String name;
private int calories;
private double price;


@Override
public int getCalories() {
	return this.calories;
}
@Override
public void setCalories(int calories) {
	this.calories = calories;
	
}
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
public int getFatContent() {
	return fatContent;
}
public void setFatContent(int fatContent) {
	this.fatContent = fatContent;
}
public int getSugarContent() {
	return sugarContent;
}
public void setSugarContent(int sugarContent) {
	this.sugarContent = sugarContent;
}


}
