package com.fdmgroup.threadingExercises;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread()+" is running");
		
	}

}
