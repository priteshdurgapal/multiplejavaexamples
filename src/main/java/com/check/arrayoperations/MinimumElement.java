package com.check.arrayoperations;

public class MinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,4,5,1,2};
		
		int l=0;
		int r= arr.length-1;
		int res = -1;
		
		while(l<r) {
			
			int mid = l+(r-l)/2;
			
			if(l==r) {
				res =  arr[l];
			}
			if(mid==l) {
				if(arr[l]<arr[r]) {
					res=arr[l];
					break;
				}
			}
			
			if(mid==r) {
				if(arr[l]>arr[r]) {
					res=arr[r];
					break;
				}
			}
				
			
			if(arr[mid]>arr[r]) {
				l = mid+1;
			}
			if(arr[mid]<arr[l]) {
				r=mid-1;
			}
			
			
		}
		System.out.println(res);

	}

}
