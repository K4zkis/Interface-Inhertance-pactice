package com.fdmgroup.streamsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(12345678,987654,"Mr J Smith", "savings",1.1,25362.91);
		BankAccount account2 = new BankAccount(87654321,234567,"Ms J Smith", "current/checking",0.2,550.0);
		BankAccount account3 = new BankAccount(74639572,946284,"Dr T Williams", "savings",1.1,4763.32);
		BankAccount account4 = new BankAccount(94715453,987654,"Ms S Taylor", "savings",1.1,10598.01);
		BankAccount account5 = new BankAccount(16254385,234567,"Mr P Brown", "current/checking",0.2,-195.74);
		BankAccount account6 = new BankAccount(38776543,946284,"Ms S Davies", "current/checking",0.2,-503.47);
		BankAccount account7 = new BankAccount(87609802,987654,"Mr B Wilson", "savings",1.1,2.5);
		BankAccount account8 = new BankAccount(56483769,234567,"Dr E Evans", "current/checking",0.2,-947.72);
		
		
		/*
		 * Use streams to find the following information
			1. The number of current/checking accounts in the ArrayList.
			2. The number of accounts which are overdrawn.
			3. The highest account balance.
			4. The average account balance.
			5. The average balance of accounts which are in credit.
			6. The sum of all overdrafts.
			7. The total amount interest due to be paid to accounts which are in credit. 
		 */
		
		List<BankAccount> accountList = new ArrayList<>();
		accountList.add(account1);
		accountList.add(account2);
		accountList.add(account3);
		accountList.add(account4);
		accountList.add(account5);
		accountList.add(account6);
		accountList.add(account7);
		accountList.add(account8);
		
		long numOfChecking = accountList.stream()
				.filter(account -> account.getAccountType().contains("current")).count();
		System.out.println(numOfChecking);
		
		long numOfOverdrawn = accountList.stream()
				.filter(account -> account.getBalance()<0).count();
		System.out.println(numOfOverdrawn);
		
		// 3. The highest account balance.
		System.out.println(accountList.stream()
				.map(account -> account.getBalance())
						.max((balance1,balance2) -> Double.compare(balance1,balance2)));
		
		// 4. The average account balance.
		System.out.println(accountList.stream()
				.mapToDouble(account -> account.getBalance())
						.average());
		// 5. . The average balance of accounts which are in credit.
		System.out.println(accountList.stream()
				.mapToDouble(account -> account.getBalance()).filter(amount -> amount<0)
						.average());
		// 6. The sum of all overdrafts.
		System.out.println(accountList.stream()
				.mapToDouble(account -> account.getBalance()).filter(amount -> amount<0)
						.sum());
		// 7. The total amount interest due to be paid to accounts which are in credit.
		System.out.println(accountList.stream().filter(account -> account.getBalance()<0)
				.mapToDouble(account -> account.getBalance()*account.getInterestRate()/100)
						.sum());
		
		/*
		 * Use streams to do the following operations
			1. Create an ArrayList of Strings containing the names of all the account
			holders who are overdrawn.
			2. Increase the interest rate on savings accounts to 1.3.
			3. Replace bank code 234567 with a new bank code 123456.
			4. Create a new ArrayList which only contains accounts with bank code
			987654.
			5. Create a new ArrayList which only contains accounts where the account
			holder has the title ‘Dr’.
		 */
		ArrayList<String> NameList = new ArrayList<>();
		accountList.stream().forEach(account -> NameList.add(account.getAccountHolder()));
		accountList.stream().filter(account -> account.getAccountType().contains("savings")).forEach(account -> account.setInterestRate(1.3));
		accountList.stream().filter(account -> account.getBankCode()==234567).forEach(account -> account.setBankCode(123456));
		List <BankAccount> AccountsOfBank987654 = accountList.stream().filter(account -> account.getBankCode()==987654)
				.collect(Collectors.toList());
		System.out.println(AccountsOfBank987654);
		List <BankAccount> AccountsOfDrs = accountList.stream().filter(account -> account.getAccountHolder().contains("Dr"))
				.collect(Collectors.toList());
		System.out.println(AccountsOfDrs);
		
		/*
		 * Use the streams reduce() method to find the following
			1. The bank account with the highest balance.
			2. The bank account with the lowest balance for sort code 987654.
		 */
		
		//1. highest Balance
		System.out.println(accountList.stream()
				.reduce((redaccount1,redaccount2) -> redaccount1.getBalance()>redaccount2.getBalance()?redaccount1:redaccount2));
		// 2. lowest balance for bankcode 987654
		System.out.println(accountList.stream()
				.filter(account -> account.getBankCode()==987654).reduce((redaccount1,redaccount2) 
						-> redaccount1.getBalance()<redaccount2.getBalance()?redaccount1:redaccount2));
	}

}
