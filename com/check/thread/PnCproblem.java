package com.check.thread;

import java.util.LinkedList;
import java.util.Queue;

public class PnCproblem {
	
	public static void main(String args[]){
	Queue<Integer> queue=new LinkedList<Integer>();
    
	int maxsize=5;
	Thread producer=new Producer(queue,maxsize);
	Thread consumer=new Consumer(queue,maxsize);
	producer.start();
	consumer.start();
	try {
		producer.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}


class Producer extends Thread{
	private Queue<Integer> queue;
	private int maxsize;
	
	Producer(Queue<Integer> queue, int maxsize){
		this.queue=queue;
		this.maxsize=maxsize;
	}
	
	public void run(){
		
		while(true){
			synchronized (queue) {
				if(queue.size()==maxsize){
					try{
						System.out.println("queue is full");
						queue.wait();
					}
					catch (Exception e) {
						// TODO: handle exception
					}
				}
				int i=0;
				System.out.println("producing value");
				queue.add(i++);
				queue.notifyAll();
			}
		}
	}
}
	
	
	class Consumer extends Thread{
		private Queue<Integer> queue;
		private int maxsize;
		
		Consumer(Queue<Integer> queue, int maxsize){
			this.queue=queue;
			this.maxsize=maxsize;
		}
		
		public void run(){
			
			while(true){
				synchronized (queue) {
					if(queue.isEmpty()){
						try{
							System.out.println("queue is empty");
							queue.wait();
						}
						catch (Exception e) {
							// TODO: handle exception
						}
					}
					
					System.out.println("consuming-");
					queue.remove();
					queue.notifyAll();
				}
			}
		}	
	
}
	