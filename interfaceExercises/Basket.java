package com.fdmgroup.interfaceExercises;

import java.util.ArrayList;

public class Basket {
private ArrayList<BasketItem> basketItems;


public Basket()
{
	this.basketItems = new ArrayList<BasketItem>();
}


public void addItem(BasketItem basketitem)
{
	this.basketItems.add(basketitem);
}

public void removeItem(BasketItem basketitem)
{
	this.basketItems.remove(basketitem);
}

public ArrayList<BasketItem> getAllItems()
{
	return this.basketItems;
}
}
