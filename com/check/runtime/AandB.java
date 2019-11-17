package com.check.runtime;

public class AandB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BaseClass bc = new BaseClass();
		bc.m1();
		bc.m2();
		bc.mstatic();
		//bc.m3;
		System.out.println("======");
		BaseClass b = new DerivedClass();
		b.m1();
		b.m2();
		b.mstatic();
		//b.m3();
		System.out.println("======");
		DerivedClass c = new DerivedClass();
		c.m1();
		c.m2();
		c.m3();
		c.mstatic();	
		
		
		
		
	}

}


