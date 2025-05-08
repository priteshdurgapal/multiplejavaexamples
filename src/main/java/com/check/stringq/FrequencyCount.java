package com.check.stringq;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcgra";
		
		char[] arr = s.toCharArray();
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
		}
		
		mp.forEach((key,value)-> {
			System.out.println(key + "--" + value);
		});
	}

}
