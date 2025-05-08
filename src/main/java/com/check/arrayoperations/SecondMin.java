package com.check.arrayoperations;

public class SecondMin {
	
	public static void main(String[] args) {
		 
		int[] arr = {1,12,13,40,5};   // 

		int max_number = arr[0];

		int second_max = arr[0];

		for(int i=1; i<arr.length;i++) {

		if(arr[i] > max_number) {
			max_number = arr[i];  //2>1 = max=2;
			
		}

			
		if(arr[i]<max_number && arr[i] != second_max) {  
			//arr[0]<
			second_max=arr[i];
		} 
		
	}
		
     System.out.println(second_max);	
     System.out.println(max_number);
		


 	}


}


