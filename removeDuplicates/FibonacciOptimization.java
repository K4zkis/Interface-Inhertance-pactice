package com.ivmedia.removeDuplicates;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FibonacciOptimization {

	public static void main(String[] args) {
		//System.out.println(FibNum(32));
		//System.out.println(lastFibDigit(21));
		// 45 is the limit where the brute force method becomes a problem
		//System.out.println(lastFibDigitWithMemo(10000)); // at 12728 it doesn't work anymore;
		//System.out.println(returnLastDigit(15));
		System.out.println(returnLastDigitWithPattern(1226261340));

	}

	static int lastFibDigit(int n) {
	    int FibNumber = FibNum(n);
	    System.out.println(FibNumber);
	    String number = String.valueOf(FibNumber);
	    return Character.getNumericValue(number.charAt(number.length()-1));
	 }
	  
	static int FibNum(int n){
	    if (n == 1)return 1;
	    else if (n == 2)return 1;
	    else return FibNum(n-1)+FibNum(n-2);
	 }
	// ^this is the brute force approach

	static int lastFibDigitWithMemo(int n) {
	        BigInteger FibNumber = calculateFibAtPosition(n, new HashMap<Integer, BigInteger>());
	        System.out.println(FibNumber);
	        String number = String.valueOf(FibNumber);
	        return Character.getNumericValue(number.charAt(number.length()-1));
	 }
	  
	  
	static BigInteger calculateFibAtPosition(int index, HashMap<Integer,BigInteger> memo) {
			if (index == 1 || index == 2)
				return BigInteger.ONE;
			if(memo.containsKey(index)) {
				return memo.get(index);
			}	
			
			BigInteger result = calculateFibAtPosition(index-1, memo).add(calculateFibAtPosition(index-2, memo));
			memo.put(index, result);
			
			return result;
	}
	
	// this is the runtime optimized approach to find the entire number
	// but that is not necessary as we just need the last number we can always take %10 after the addition
	// and optimize for memory 
	
	static int returnLastDigit(int index){
			int lastDigit = 1;
			int tempPrevious=1;
			if (index == 1 || index == 2)
				return 1;
			
			for (int i = 3; i<=index;i++) {
				int tempCurrent = (tempPrevious+lastDigit)%10;
				tempPrevious = lastDigit;
				lastDigit = tempCurrent;
			}
			return lastDigit;
		}
	
	// since the last numbers repeats after ~ 60 numbers we can can find a repeating pattern in these numbers
	
	static List<Integer> getLastDigitPatternOfFibonacci() {
		List<Integer> pattern = new ArrayList<>();
		List<Integer> patternLeft;
		List<Integer> patternRight;
		boolean noMatchedPattern = true;
		int fibIndex = 1;
		
		while(noMatchedPattern) {
			pattern.add(returnLastDigit(fibIndex));
			
			if (pattern.size()%2==0 && pattern.size()!=2) {
				patternLeft = pattern.subList(0, pattern.size()/2);
				patternRight = pattern.subList(pattern.size()/2, pattern.size());
				
				if(patternLeft.equals(patternRight)) {
				return patternLeft;
				}
			}
			
			fibIndex++;
			
			if (fibIndex>1000) {
				System.err.println("no pattern could be found withing the first 1000 numbers");
				noMatchedPattern = false;	
			}	
		}
		
		return pattern;
	}
	
	static int returnLastDigitWithPattern(int index) {
		List<Integer> pattern = getLastDigitPatternOfFibonacci();
		System.out.println(pattern.size());
		int positionInPattern = index%pattern.size();
		System.out.println(positionInPattern);
		if (positionInPattern == 0) return 0;
		else return pattern.get(positionInPattern-1);
	}
	}


