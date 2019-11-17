package com.check.innerclass;

public class Main {

	public static void main(String[] args) {
		// accessing an inner class 
        OuterInner outerObject = new OuterInner(); 
        OuterInner.InnerClass innerObject = outerObject.new InnerClass(); 
          
        innerObject.display(); 
          

	}

}
