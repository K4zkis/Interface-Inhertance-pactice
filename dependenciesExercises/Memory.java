package com.fdmgroup.dependenciesExercises;

public class Memory {
	public final String MODEL;
	public final Double CAPACITY;
	public final Double SPEED;
	public Double usedSpace;
	
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

	public Double getUsedSpace() {
		return usedSpace;
	}

	public void setUsedSpace(Double usedSpace) {
		this.usedSpace = usedSpace;
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
