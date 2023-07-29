package com.fdmgroup.classesAndObjectsExercises;

public class Memory {
	public final String MODEL;
	public final Double CAPACITY;
	public final Double SPEED;
	public static Double usedSpace;
	
	public Memory(String model, Double capacity, Double speed)
	{
		this.MODEL = model;
		this.CAPACITY = capacity;
		this.SPEED = speed;
	}
	
	public static void storeData(String data)
	{
		System.out.println("storeData with data = " + data);
	}

	public static Double getUsedSpace() {
		return usedSpace;
	}

	public static void setUsedSpace(Double usedSpace) {
		Memory.usedSpace = usedSpace;
	}

	public String getMODEL() {
		return MODEL;
	}

	public Double getCAPACITY() {
		return CAPACITY;
	}

	public Double getSPEED() {
		return SPEED;
	}

}
