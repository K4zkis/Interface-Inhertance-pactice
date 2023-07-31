package com.fdmgroup.BubbleSort;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(primeNumbers(10_000).toString());

	}

public static ArrayList<Integer> primeNumbers(int limitNumber)
{
	ArrayList<Integer> primes = new ArrayList<Integer>();
	int primeCounter =2;
	if (primeCounter<= limitNumber) primes.add(primeCounter);
	
	while (primeCounter <= limitNumber)
	{
		int comparisonCounter = 0;
		for (Integer testDivider:primes)
		{
			if (primeCounter%(int)testDivider!= 0)comparisonCounter++;
			
		}
		if (comparisonCounter==primes.size()) primes.add(primeCounter);
		primeCounter++;
	}
	return primes;
}


public static ArrayList<Integer> primeNumbersRecursive(int limitNumber)
{
	return null;
}

}
