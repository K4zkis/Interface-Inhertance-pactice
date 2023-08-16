package com.fdmgroup.threadingExercises;

import java.util.ArrayList;

public class ThreadManagerChild extends ThreadManager{
	ArrayList<Thread> threads = new ArrayList<>();
	
	@Override
	public void createThreads(int number) {
		/*
		 * Override the createThreads method so that it doesn’t use the MyRunnable class. Instead it
			should create the threads on the fly using either a Runnable or a lambda expression.
		Functionality of before:.
			a. Create an object of MyRunnable.
			b. Create a thread object placing the MyRunnable object into its constructor.
			c. Give the thread object a name based on its sequence i.e. thread1, thread2 etc.
			d. Add the thread to the List of threads.
	e. Repeat until the required number of threads has been created.
		 */
		
		// new Thread(() -> {}).start();

		
		for (int i = 0; i< number; i++) {
			String nameVar = "thread"+(i+1);
			Runnable instanceOfRunnable = () -> {System.out.println(Thread.currentThread()+" is running");};
			Thread thread = new Thread(instanceOfRunnable, nameVar);
			threads.add(thread);
			
		}
		
		
	}
	public void runThreads() {
		/*
		 * Implement the runThreads() method. It should start each of the threads in the List of threads.
		 */
		for (Thread thread: threads) {
			thread.start();
		}
	}
}
