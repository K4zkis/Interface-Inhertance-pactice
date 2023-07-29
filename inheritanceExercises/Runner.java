package com.fdmgroup.inheritanceExercises;

public class Runner {

	public static void main(String[] args) {
		Customer vinh = new Customer("Vinh", "penis", "Nhu Kevin Tieu");
		Customer janus = new Customer("Janus", "schlong", "Janus Milojevic");
		
		AdminUser sharon = new AdminUser("Sharon", "Vagina", "Sharon Marcu");
		AdminUser jule = new AdminUser("Jule", "schmedium", "Jule grothjan");
		
		System.out.println(janus.changePassword("schminimun", "schminimun"));
		System.out.println(janus.changePassword("schminimun", "schmedium"));
		
		vinh.accessWebsite();
		jule.accessWebsite();
		
		UserAccountManager spring = new UserAccountManager();
		spring.addUser(jule);
		spring.addUser(janus);
		spring.addUser(vinh);
		spring.addUser(sharon);
		
		System.out.println(spring.login("Sharon", "Vagina"));
		System.out.println(spring.login("Jule", "notherpassword"));
		
	}

}
