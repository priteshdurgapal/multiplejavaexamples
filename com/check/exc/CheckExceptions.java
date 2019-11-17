package com.check.exc;

public class CheckExceptions {

	
	public static void main(String[] args)  throws CustomException{
		
	
			int i=5;
			int y=0;
			int c=i/y;
			throw new CustomException("divide by zero");
		
		
		
		
		
	}
}
