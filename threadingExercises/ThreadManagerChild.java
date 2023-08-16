package com.fdmgroup.threadingExercises;

public class ThreadManagerChild extends ThreadManager{

	
	@Override
	public void createThreads(int number) {
		/*
		 * Override the createThreads method so that it doesn’t use the MyRunnable class. Instead it
			should create the threads on the fly using either a Runnable or a lambda expression.
		 */
		for (int i = 0; i< number; i++) {
			String nameVar = "thread"+(i+1);
			Runnable instanceOfRunnable = () -> {};
			Thread thread = new Thread(instanceOfRunnable, nameVar);
			threads.add(thread);
			
		}
		
	}
}
