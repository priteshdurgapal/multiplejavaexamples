package com.check.stringq;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {
	
	public static void main(String[] args) {
		int result = getUniqueCharacterSubstring("abcabcdbbabcccdd");
		System.out.println(result);
	}

	/*static String getUniqueCharacterSubstring(String input) {
	    Map<Character, Integer> visited = new HashMap<>();
	    String output = "";
	    for (int start = 0, end = 0; end < input.length(); end++) {
	        char currChar = input.charAt(end);
	        if (visited.containsKey(currChar)) {
	            start = Math.max(visited.get(currChar)+1, start);
	        }
	        if (output.length() < end - start + 1) {
	            output = input.substring(start, end + 1);
	        }
	        visited.put(currChar, end);
	    }
	    return output;
	}
	*/
	static int getUniqueCharacterSubstring(String s) {
		
		int start = 0;
		int end = 0;
		int maxLength = 0;
		String op = "";
		Set<Character> setChar = new HashSet<>();
		
		while(end<s.length()-1) {
			if(setChar.add(s.charAt(end))) {
				end++;
				maxLength = Math.max(maxLength, setChar.size());
				
			}
			else {
				start++;
				setChar.remove(s.charAt(start));
			}
		}
		System.out.println(s.charAt(start) + "" + s.charAt(end));
		
		return maxLength;
	}
	
}
