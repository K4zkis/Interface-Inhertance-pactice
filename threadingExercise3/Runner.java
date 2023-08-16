package com.fdmgroup.threadingExercise3;

public class Runner {

	public static void main(String[] args) {
		AverageCalculator aC = new AverageCalculator();
		String name = "c:\\temp\\TestRecords.txt";
		FileReaderThread fRT1 = new FileReaderThread(name,aC);
		fRT1.start();
		try {
			fRT1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(aC.calculateAverage());
		System.out.println(aC.getTotal());
		System.out.println(aC.getCount());
	}

}
