package com.fdmgroup.threadingExercise3;

public class AverageCalculator {
private long total; 
private long count;

public long getTotal() {
	return total;
}
public long getCount() {
	return count;
}
public synchronized void addToTotal (int number) {
	this.total = this.total+number;
	this.count++;
	
}

public double calculateAverage() {
	return (double) this.total/this.count;
}

}
