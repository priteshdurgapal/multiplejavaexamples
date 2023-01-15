package com.check.runtime;

public class DerivedClass extends BaseClass {
	
	void m2() 
    { 
        System.out.println("Inside Derived m2 method"); 
    } 
	
	void m3() 
    { 
        System.out.println("Inside Derived m3 method"); 
    } 
	
	static void mstatic() {
		System.out.println("Inside Derived mstatic method"); 
	}
}
