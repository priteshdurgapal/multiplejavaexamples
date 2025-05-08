package com.check.thread;

public class Summation {
	
	int sum=0;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
	
	public synchronized void calculate() {
		setSum(getSum()+1);
	}

}
