package com.fdmgroup.threadingExercises;

import java.util.ArrayList;
import java.util.List;

public class ThreadManager {
	protected List<Thread> threads = new ArrayList<>();;
	
	
	public void createThreads(int number) {
		/*
		 * Implement the createThreads() method. The method’s argument indicates the number of
			threads which the method will create.
			a. Create an object of MyRunnable.
			b. Create a thread object placing the MyRunnable object into its constructor.
			c. Give the thread object a name based on its sequence i.e. thread1, thread2 etc.
			d. Add the thread to the List of threads.
			e. Repeat until the required number of threads has been created.
		 */
		for (int i = 0; i< number; i++) {
			String nameVar = "thread"+(i+1);
			MyRunnable runObj = new MyRunnable();
			Thread thread = new Thread(runObj, nameVar);
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
