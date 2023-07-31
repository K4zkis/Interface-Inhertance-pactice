package com.fdmgroup.CastingExercises;

import java.util.ArrayList;

public class CalorieCounter {
private ArrayList<FoodItem> lowCalorieFoods;

public CalorieCounter()
{
	this.lowCalorieFoods = new ArrayList<FoodItem>();
}

public void addLowCalorieFood(FoodItem foodItem)
{
	if (foodItem.getCalories()<=500)this.lowCalorieFoods.add(foodItem);
}

public ArrayList<FoodItem> getAllLowCalorieFoods()
{
	return this.lowCalorieFoods;
}

public void removeHighCalorieFoodsFromBasket(Basket basket, int calories)
{
	ArrayList<BasketItem> basketList = basket.getAllItems();
	for (BasketItem item: basketList)
	{
		//checking each basket item
		
		if (item.getClass().equals(FoodItem.class))
			//only selecting the fooditems
			System.out.println(item.getName());
		{
			FoodItem food = (FoodItem) item;
			// casting it to a fooditem to get accese to the getcalories method
			if (food.getCalories()>= calories)// remove from basket if calories above the specified amount
				basket.removeItem(item);
		}
	}
}

}
