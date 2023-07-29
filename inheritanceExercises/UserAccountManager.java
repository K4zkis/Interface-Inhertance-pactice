package com.fdmgroup.inheritanceExercises;

import java.util.ArrayList;

public class UserAccountManager {
private ArrayList<UserAccount> userAccounts;

public UserAccountManager()
{
	this.userAccounts = new ArrayList<UserAccount>();
	
}

public void addUser(UserAccount user)
{
	this.userAccounts.add(user);
}

public boolean login(String username, String password)
{
	boolean match = false;
	for (UserAccount eachUser:userAccounts)
	{
		if (eachUser.getUsername().equals(username) && eachUser.getPassword().equals(password))
			match = true;
	}
	return match;}
}
