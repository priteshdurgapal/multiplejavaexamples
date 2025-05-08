package com.check.stringq;

public class AnagramTest {
	
	public static void main(String[] args) {
		String s1="silen";
		String s2="listen";
		int[] count = new int[256];
		boolean result = true;
		
		for(int i=0;i<s1.length();i++) {
			
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		
		System.out.println(s1.charAt(2));
		System.out.println(count['t']);
	
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				result = false;
			}
		}
		System.out.println(result);
	}

}
