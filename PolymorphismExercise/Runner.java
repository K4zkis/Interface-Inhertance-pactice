package com.fdmgroup.PolymorphismExercise;

public class Runner {

	public static void main(String[] args) {
		Customer vinh = new Customer("Vinh", "penis", "Kevin someone");
		Customer janus = new Customer("Janus", "schlong", "Janus Milojevic");
		
		AdminUser sharon = new AdminUser("Sharon", "Vagina", "Sharon someone");
		AdminUser jule = new AdminUser("Jule", "passwordwith10chars", "Jule someone");
		
		System.out.println(janus.changePassword("schminimun", "schminimun"));
		System.out.println(janus.changePassword("schminimun", "schmedium"));
		
		vinh.accessWebsite();
		jule.accessWebsite();
		
		UserAccountManager spring = new UserAccountManager();
		spring.addUser(jule);
		spring.addUser(janus);
		spring.addUser(vinh);
		spring.addUser(sharon);
		
		//System.out.println(spring.login("Sharon", "Vagina"));
		//System.out.println(spring.login("Jule", "notherpassword"));
		
		AdminUser.setMinAdminPasswordLength(10);
		Customer.setMinCustomerPasswordLength(7);
		
		System.out.println(jule.changePassword("anotherwordwith10chars", "anotherwordwith10chars"));
		jule.changePassword("oldpassforjanus", "oldpassforjanus", janus);
		
	}

}
