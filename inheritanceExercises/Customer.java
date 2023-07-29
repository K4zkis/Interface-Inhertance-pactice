package com.fdmgroup.inheritanceExercises;

public class Customer extends UserAccount{
	
public Customer(String username, String password, String fullName)
{
	super(username,password,fullName);
}
@Override
public void accessWebsite()
{
	System.out.println("accessing website as customer");
}
}
