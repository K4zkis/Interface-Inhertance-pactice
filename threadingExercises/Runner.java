package com.fdmgroup.threadingExercises;

public class Runner {

	public static void main(String[] args) {
//		ThreadManager threadManager = new ThreadManager();
//		threadManager.createThreads(8);
//		threadManager.runThreads();
		/*
		 * Create an object of ThreadManagerChild in the main method of your Runner class. Call its
			methods and verify that it still works.
		 */
		ThreadManagerChild childThread = new ThreadManagerChild();
		childThread.createThreads(6);
		childThread.runThreads();
	}

}
