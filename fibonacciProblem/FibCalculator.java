package com.fdmgroup.fibonacciProblem;

import java.util.HashMap;

public class FibCalculator {
		// since we know fib(1) and fib(0) everything can be reduced down to it
		//fib(8)= fib(6)+fib(7)= fib(4) + fib(5) + fib(5) + fib(6) 
		//= fib(2)+fib(3)+fib(3)+fib(4)+fib(3)+fib(4)+fib(4)+fib(5)
		//= fib(0)+fib(1)+fib(1)
	
	public static int calculateFibAtPosition(int index) {
		if (index == 0 || index == 1)return index;
		return calculateFibAtPosition(index-1)+calculateFibAtPosition(index-2);
	}
		// but going through the tree recursively has an exponential time complexity O(n^2) 
		//can be optimized since there a lot of duplicate sub problems;
		// -> memoization
		// a datastructure that givess me a lookuptime Of O(1) is really important here
		// -> hashed datastructure
		// -> key = input value = return 
		// -> now Time is O(n) and Space O(n) (technically time = O(2*n))
	
	public static int calculateFibAtPosition(int index, HashMap<Integer,Integer> memo) {
		if (index == 0 || index == 1)
			return index;
		if(memo.containsKey(index)) {
			return memo.get(index);
		}	
		
		int result = calculateFibAtPosition(index-1, memo)+calculateFibAtPosition(index-2, memo);
		memo.put(index, result);
		
		return result;
	}
	
	public static int fibWithMemo(int index) {
		//helper method
		return calculateFibAtPosition(index,new HashMap<>());
		
	}
}
