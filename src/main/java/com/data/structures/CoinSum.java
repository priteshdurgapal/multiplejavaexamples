package com.data.structures;

public class CoinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=6;
		int n2=3;
		int n3=1;
		int s1,s2,s3;
		s1=s2=s3=0;
		int reqSum = 11;
		//11-6=5
		//5-3=2
		//2-1=1
		//1-1=0
		
		int tempSum=reqSum;
		while(tempSum>=0) {
			//System.out.println("here");
			//tempSum = tempSum-n1;
			System.out.println(tempSum);
			if(reqSum>n1) {
				s1++;
				tempSum = reqSum-n1; //11-6=5
				
				System.out.println("n1"+reqSum);
			}
		
		if(reqSum>n2) {
			tempSum = reqSum-n2; //5-3=2
			s2++;	
			System.out.println("n2"+reqSum);
			}
		
		if(reqSum>n3) {
			tempSum = reqSum-n3;
			s3++;
			System.out.println("n3"+reqSum);
		 }
		else {
			tempSum = reqSum-n3;
		}
		
		}
		//System.out.println("n3"+reqSum);
		/*System.out.println("value6-"+s1);
		System.out.println("value3-"+s2);
		System.out.println("value1-"+s3);*/
			
	
	}
}
