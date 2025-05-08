package com.check.arrayoperations;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Too hot to hoot";
		String ar = test.toLowerCase();
		char[] arr = ar.toCharArray(); 
		boolean result = true;
		int i=0;
		int j=arr.length-1;
		while(i<j) {
		  if( !(arr[i]>=98 || arr[i]<=114)) {
			  i++;   
		    }
		  else if(!(arr[j]>=98 || arr[j]<=114)) {
				  j--;
			}
		  else if(arr[i++]!=arr[j--]) {
				  result=false;
				 
			  }
		  else {
			  result=true;
		  }
		  }
		System.out.println(result);
	}

}
