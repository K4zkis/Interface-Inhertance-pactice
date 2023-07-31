package com.fdmgroup.PolymorphismExercise;

public class AdminUser extends UserAccount{
	
private static int minAdminPasswordLength;

public AdminUser(String username, String password, String fullName)
{
	super(username,password,fullName);
}
@Override
public void accessWebsite()
{
	System.out.println("accessing website with admin rights");
}

@Override
public boolean changePassword(String newPass, String confirmPass)
{
	boolean changePassword = false;
	
	if (newPass.equals(confirmPass) && newPass.length() >= AdminUser.minAdminPasswordLength)
	{
		super.changePassword(newPass, confirmPass);
		changePassword = true;
	}
	System.out.println("current password: "+super.getPassword());
	return changePassword;
}

public void changePassword(String newPass, String confirmPass, UserAccount user)
{
	user.changePassword(newPass, confirmPass);
	System.out.println("current password of "+user.getFullName()+": "+user.getPassword());
}

public static int getMinAdminPasswordLength() {
	return minAdminPasswordLength;
}
public static void setMinAdminPasswordLength(int minAdminPasswordLength) {
	AdminUser.minAdminPasswordLength = minAdminPasswordLength;
}


}
