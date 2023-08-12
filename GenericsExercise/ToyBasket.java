package com.fdmgroup.GenericsExercise;

import java.util.ArrayList;
import java.util.List;

public class ToyBasket {
 List<Toy> toys = new ArrayList<>();
 // List<Object> toys = new ArrayList<>(); ->> all following nees to substitute for object as well
 // the problem now is, that this list can hold anything, Strings, Integers or even other Lists
 
 public List<Toy> getToysInBasket(){
	 return toys;
 }
 
 public void addToy(Toy toy) {
	 toys.add(toy);
 }
}