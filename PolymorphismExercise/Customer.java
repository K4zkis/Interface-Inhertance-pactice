package com.fdmgroup.PolymorphismExercise;

public class Customer extends UserAccount{
	
private static int minCustomerPasswordLength;
	
public static int getMinCustomerPasswordLength() {
	return minCustomerPasswordLength;
}
public static void setMinCustomerPasswordLength(int minCustomerPasswordLength) {
	Customer.minCustomerPasswordLength = minCustomerPasswordLength;
	System.out.println("set to: "+Customer.minCustomerPasswordLength);
}
public Customer(String username, String password, String fullName)
{
	super(username,password,fullName);
}
@Override
public boolean changePassword(String newPass, String confirmPass)
{
	boolean changePassword = false;
	
	if (newPass.equals(confirmPass) && newPass.length() >= Customer.minCustomerPasswordLength)
	{
		super.changePassword(newPass, confirmPass);
		changePassword = true;
	}
	System.out.println("current password: "+super.getPassword());
	return changePassword;
}

@Override
public void accessWebsite()
{
	System.out.println("accessing website as customer");
}
}
