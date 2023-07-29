package com.fdmgroup.classesAndObjectsExercises;

public class HardDrive {
	private final String MODEL;
	private final Double CAPACITY;
	private static Double usedSpace;
	
	public HardDrive(String model, Double capacity)
	{
		this.MODEL = model;
		this.CAPACITY = capacity;
	}
	
	public static  String readData(String file)
	{
		return "data from "+file;
	}
	
	public static void writeData(String data, String file)
	{
		System.out.println("writeData data = "+data+"and file = "+ file); 
	}

	public static Double getUsedSpace() {
		return usedSpace;
	}

	public static void setUsedSpace(Double usedSpace) {
		HardDrive.usedSpace = usedSpace;
	}

	public String getModel() {
		return MODEL;
	}

	public Double getCapacity() {
		return CAPACITY;
	}

}
