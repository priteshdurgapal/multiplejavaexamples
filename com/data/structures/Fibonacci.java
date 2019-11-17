package com.data.structures;

public class Fibonacci {
	
	static int fibCal(int num) {
		if(num<=1) {
			return num;
		}
		else {
			return fibCal(num-1) + fibCal(num-2);
		}
	}
	
	static int fibDP(int num) {
		int f[] = new int[num+1];
		f[0] = 0;
		f[1] = 1;
		for(int i=2;i<=num;i++) {
			f[i] = f[i-1] + f[i-2];
			//System.out.println(i + "i" + f[i]);
		}
		//System.out.println(f[num]);
		return f[num];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 9;
		int answer = fibCal(number);
		System.out.println(answer);
		int answer2 = fibDP(number);
		System.out.println(answer2);
	}

}
