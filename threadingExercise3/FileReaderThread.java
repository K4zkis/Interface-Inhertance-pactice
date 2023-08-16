package com.fdmgroup.threadingExercise3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderThread extends Thread{
private AverageCalculator averageCalculator;
private String fileName;


public FileReaderThread(String name, AverageCalculator averCalculator) {
	this.fileName = name;
	this.averageCalculator= averCalculator;
}
@Override
public void run() {
	BufferedReader br = null;
	FileReader in = null;
	/*
	 * Override the run method in FileReaderThread to read through the file.
		a. Split each line by the comma symbol
		b. Convert each number in the resulting array to an int then pass it to
		AverageCalculator’s addToTotal method.
	 */
	try {
			in = new FileReader(this.fileName);
			br = new BufferedReader(in);
			String currentline = null;
			while ((currentline = br.readLine())!= null) {
				System.out.println(currentline);
				String[] numberStrings = currentline.split(",");
				for (String numberString : numberStrings) {
					int number = Integer.parseInt(numberString);
					averageCalculator.addToTotal(number);
					}
				}
		}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			br.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
}
