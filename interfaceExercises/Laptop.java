package com.fdmgroup.interfaceExercises;

public class Laptop implements BasketItem{
private double cpuSpeed;
private double memory;
private double hardDrive;
private String name;
private double price;



@Override
public void setName(String name) {
	this.name = name;
	
}
@Override
public String getName() {
	return this.name;
}
@Override
public void setPrice(double price) {
	this.price =price;
	
}
@Override
public double getPrice() {
	return this.price;
}
public double getCpuSpeed() {
	return cpuSpeed;
}
public void setCpuSpeed(double cpuSpeed) {
	this.cpuSpeed = cpuSpeed;
}
public double getMemory() {
	return memory;
}
public void setMemory(double memory) {
	this.memory = memory;
}
public double getHardDrive() {
	return hardDrive;
}
public void setHardDrive(double hardDrive) {
	this.hardDrive = hardDrive;
}
	
	
	
}
