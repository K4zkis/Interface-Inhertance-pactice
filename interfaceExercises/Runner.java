package com.fdmgroup.interfaceExercises;

public class Runner {

	public static void main(String[] args) {
		Toy chessSet = new Toy();
		chessSet.setName("Chess Set");
		chessSet.setPrice(84.60);
		chessSet.setMinAge(5);
		chessSet.setMaxAge(99);
		
		Laptop surface = new Laptop();
		surface.setCpuSpeed(1666.9);
		surface.setHardDrive(2048.1);
		surface.setMemory(16.4);
		surface.setName("Surface 7 Pro");
		surface.setPrice(769.80);
		
		Snack twix = new Snack();
		twix.setCalories(469);
		twix.setFatContent(20);
		twix.setName("Twix Bar");
		twix.setPrice(2.69);
		twix.setSugarContent(35);
		
		Snack sandwich = new Snack();
		sandwich.setCalories(680);
		sandwich.setFatContent(57);
		sandwich.setName("BLT");
		sandwich.setPrice(5.49);
		sandwich.setSugarContent(20);
		
		ReadyMeal meal1 = new ReadyMeal();
		meal1.setCalories(730);
		meal1.setCuisineType(null);
		meal1.setName("Rice and Chicken");
		meal1.setPrice(8.50);
		
		ReadyMeal meal2 = new ReadyMeal();
		meal2.setCalories(320);
		meal2.setCuisineType("Eastern");
		meal2.setName("Falafel Burrito");
		meal2.setPrice(5.32);
		
		Basket basket1 = new Basket();
		
		CalorieCounter counter1 = new CalorieCounter();
		
		basket1.addItem(meal2);
		basket1.addItem(meal1);
		basket1.addItem(twix);
		basket1.addItem(sandwich);
		basket1.addItem(surface);
		basket1.addItem(chessSet);
		
		for (BasketItem item:basket1.getAllItems())
		{
			System.out.println(item.getName());
		}
		
		basket1.removeItem(twix);
		
		for (BasketItem item:basket1.getAllItems())
		{
			System.out.println(item.getName());
		}
		
		counter1.addLowCalorieFood(meal2);
		counter1.addLowCalorieFood(meal1);
		counter1.addLowCalorieFood(twix);
		counter1.addLowCalorieFood(sandwich);
		
		//counter1.addLowCalorieFood(chessSet);
		
		for (FoodItem item:counter1.getAllLowCalorieFoods())
		{
			//System.out.println(item.getName());
			System.out.println(item.getCalories());
		}
		
		

	}

}
