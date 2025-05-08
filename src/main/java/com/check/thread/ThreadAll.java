package com.check.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ThreadAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(() -> {
			System.out.println("hello");
		});
		
		t1.start();
		
		Summation summation = new Summation();
		
		//Callable
		
		ExecutorService execute = Executors.newFixedThreadPool(3);
		IntStream.range(0, 1000)
	      .forEach(count -> execute.submit(summation::calculate));
		/*
		 * try { execute.awaitTermination(1000, TimeUnit.MILLISECONDS); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		System.out.println(summation.getSum());
		
	 }
	
	
		

}
