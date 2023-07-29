package com.fdmgroup.classesAndObjectsExercises;

public class Processor {
	public final String MODEL;
	public final Double SPEED;
	public final int NUM_OF_CORES;
	
	public Processor(String model,Double speed, int numberOfCores)
	{
		this.MODEL = model;
		this.NUM_OF_CORES = numberOfCores;
		this.SPEED = speed;
	}
	
	public String getMODEL() {
		return MODEL;
	}

	public Double getSPEED() {
		return SPEED;
	}

	public int getNUM_OF_CORES() {
		return NUM_OF_CORES;
	}

	public static void processData(String data)
	{
		System.out.println("processData with data = "+data);
	}

}
