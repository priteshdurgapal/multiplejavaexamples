package com.check.randome;

public class Testthirdfourth {

	public static void main(String[] args) {

		char A[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'l', 'j', 'k', '1', '2', '3', '4', '5', '6', '7', '8', 'a',
				'b', 'c', 'd', 'e', 'f', 'g', 'h', 'l', 'j', 'k', '1', '2', '3', '4', '5', '6', '7' };
		int len = A.length;
		MyPrint(A, len);
	}

	static void MyPrint(char A[], int len) {
		/*
		 * int temp_third=0; int temp_fourth=0; for(int i=0;i<len;i++){
		 * temp_third=temp_third + 1;
		 * 
		 * if(temp_third == 2){ System.out.println(A[i]); temp_fourth = temp_third; }
		 * if(temp_third!=0){ temp_fourth = }
		 */
		/*
		 * boolean flag = false; int temp = 0; int orgLen=len; int count=0;
		 * while(len>0){ if(len>=3 &&count ==0) { temp = temp + 2; len = len - 2;
		 * System.out.println(A[temp]); flag = true; count++; } if(flag ==false &&
		 * count>0){ temp = temp + 3; // System.out.println("temp3-" + temp); // len =
		 * len - 3; if(temp<orgLen) { System.out.println(A[temp]); flag = true; len =
		 * len - 3; } else { break; } } if(flag ==true && count>0){ temp = temp + 4; //
		 * System.out.println("temp4-" + temp); //len = len - 4; if(temp<orgLen) {
		 * System.out.println(A[temp]); flag = false; len = len - 4; } else { break; } }
		 */
	}

}
