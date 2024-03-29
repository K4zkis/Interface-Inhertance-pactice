package com.fdmgroup.dependenciesExercises;

public class Computer {
	private final String MODEL;
	private final Processor PROCESSOR;
	private HardDrive hardDrive;
	private Memory memory;
	
	public Computer(String model, HardDrive hardDrive, Memory memory, Processor processor)
	{
		this.MODEL =  model;
		this.PROCESSOR = processor;
		this.hardDrive = hardDrive;
		this.memory = memory;
	}
	
	public void turnOn()
	{
		System.out.println("Com turned on");
	}
	public void turnOff()
	{
		System.out.println("Com turned off");
	}

	public HardDrive getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
		//why does Computer.memory = memory not work? 
		//does the autogenerated one refer to the object instead of the instance?	
		}

	public String getMODEL() {
		return MODEL;
	}

	public Processor getPROCESSOR() {
		return PROCESSOR;
	}
	public void getPower(PowerSource powersource)
	{
		System.out.println(powersource.supplyPower()+" watts received from power source");
	}
}
