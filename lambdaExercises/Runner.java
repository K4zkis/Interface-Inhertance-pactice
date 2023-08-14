package com.fdmgroup.lambdaExercises;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
		 * Write a lambda expression which implements the Function interface. It should take a bank
			account as an argument and return a String containing the customer’s name and balance.
			Test using account3 (should return “Dr T Williams: 4763.32”) and account4 (should return “Ms
			S Taylor: 10598.01”)
		 */
		Function<BankAccount,String> returnNameAndBalance = account -> account.getAccountHolder() + ": "+ account.getBalance();
		System.out.println(returnNameAndBalance.apply(account3));
		System.out.println(returnNameAndBalance.apply(account4));
		
		/*
		 * Write a lambda expression which implements the Function interface. It should take a bank
			account as an argument and return a double containing the amount of interest due on the
			account. This can be calculated as follows: balance * interest rate / 100. Test this using
			account2. It should return 1.1.
		 */
		Function <BankAccount,Double> returnInterestAmount = account -> account.getInterestRate()*account.getBalance()/100;
		System.out.println(returnInterestAmount.apply(account2));
		
		/*
		 * Write a modified version of your previous lambda expression which returns 0 if the account is
			ovedrawn. Test with account2 (should return 1.1) and account8 (should return 0.0). You will
			need to use a ternary operator.
		 */
		Function <BankAccount,Double> returnInterestAmountIfOverZero = account -> account.getBalance()>0 ?account.getInterestRate()*account.getBalance()/100 : 0.0;
		System.out.println(returnInterestAmountIfOverZero.apply(account2));
		System.out.println(returnInterestAmountIfOverZero.apply(account8));
		
		/*
		 * Write a lambda expression which implements the Predicate interface. It should take a bank
			account as an argument. If the bank account is a current account the expression should
			return true, otherwise it should return false. Test with account1 (should return false) and
			account6 (should return true)
		 */
		Predicate<BankAccount> isCurrentAccount = account -> account.getAccountType().contains("current");
		System.out.println(isCurrentAccount.test(account1));
		System.out.println(isCurrentAccount.test(account6));
		
//		String test = "current/checking";
//		System.out.println(test.contains("current"));
		
		/*
		 * Write a lambda expression which implements the Predicate interface. It should take a bank
			account as an argument. If the bank account is overdrawn it should return true, otherwise it
			should return false. Test with account5 (should return true) and account7 (should return false)
		 */
		
		Predicate<BankAccount> isOverdrawn = account -> account.getBalance()<0;
		System.out.println(isOverdrawn.test(account5));
		System.out.println(isOverdrawn.test(account7));
		
		/*
		 * Write a lambda expression which implements the BinaryOperator interface. It should take 2
			bank accounts as arguments and return the bank account which has the highest balance.
			Test using account3 and account4 as arguments, it should return account4 (balance is
			10598.01). You will need to use a ternary operator
		 */
		
		BinaryOperator<BankAccount> higherBalance = (lambdaAccount1,lambdaAccount2) -> lambdaAccount1.getBalance() > lambdaAccount2.getBalance() ? lambdaAccount1 : lambdaAccount2;
		System.out.println(higherBalance.apply(account3,account4).toString());
		
		/*
		 * Write a lambda expression which implements the Consumer interface. It should take a bank
			account as an argument. It should then deduct a £10 fee from the balance. Test using
			account2 and account6. Call the getBalance() method on the two objects to check that their
			balances have been updated (account2 should be 540.0 and account6 should be -513.47).
		 */
		
		Consumer<BankAccount> feeDeduction = account -> account.setBalance(account.getBalance()-10);
		feeDeduction.accept(account2);
		feeDeduction.accept(account6);
		System.out.println(account2.getBalance());
		System.out.println(account6.getBalance());
		
		/*
		 * Write a lambda expression which implements the BiConsumer interface. It should take 2
			arguments: a bank account and an integer. It should deduct the integer value from the
			account’s balance. Test using account1 and 100. The getBalance() method should show that
			account1’s balance is now 25262.91. Also test with account5 and 50. The balance afterwards
			should be -245.74
		 */
		BiConsumer<BankAccount,Integer> deductAmount = (account,amount) -> account.setBalance(account.getBalance()-amount);
		
		deductAmount.accept(account1,100);
		deductAmount.accept(account5,50);
		System.out.println(account1.getBalance());
		System.out.println(account5.getBalance());
	}

}
