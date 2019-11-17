package com.data.structures;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,13,4,5,68,19};
		insertionSort(arr);
		
	}

	public static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int size = arr.length;
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
		for(Integer in : arr) {
			System.out.println(in);
		}
	}

}
