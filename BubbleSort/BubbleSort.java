package com.fdmgroup.BubbleSort;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] testArray = {3,2,1,5,4};
		
		System.out.println(Arrays.toString(sortIntArray(testArray)));

	}
	
	public static int[] sortIntArray(int[] unsortedArray)
	{
		int[] sortedArray = unsortedArray.clone();
		int buffer;
		for (int i = 0; i<sortedArray.length-1;i++)
		{
			if (sortedArray[i]>sortedArray[i+1])
			{
				buffer = sortedArray[i];
				sortedArray[i]= sortedArray[i+1];
				sortedArray[i+1] = buffer;
			}
		}
		return sortedArray;
	}
	
	
	
	
	
	
	
	@Override
	public boolean equals(Object bubbleSortObject)
	{
		return false;
	}
	public boolean equals(BubbleSort bubbleSortObject)
	{
		//overloading the previous one to only compare bubblesort objects
		return true;
	}
}
