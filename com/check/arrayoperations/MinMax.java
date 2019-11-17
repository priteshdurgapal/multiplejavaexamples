package com.check.arrayoperations;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {12,1,4,6,3,100};
		int a_min = arr[0];
		int a_max = arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(a_min>arr[i]) {
				a_min = arr[i];
			}
			
			if(a_max<arr[i]) {
				a_max = arr[i];
			}
		}
		List<Integer> list = Arrays.asList(5, 9, 7, 11);
		System.out.println(list);
		//sint[] arrer	=ArrayUtils.toPrimitivelist.toArray();
		System.out.println("a_max"+a_max);
		System.out.println("a_min"+a_min);
		//TreeMap<String, Integer> tmp = new TreeMap<String,Integer>();
		//TreeSet<String> tset	= new TreeSet<>();
		//tset.
		
	}

}
