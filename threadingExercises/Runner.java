package com.fdmgroup.threadingExercises;

public class Runner {

	public static void main(String[] args) {
		ThreadManager threadManager = new ThreadManager();
		threadManager.createThreads(8);
		threadManager.runThreads();
		

	}

}
