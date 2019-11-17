package com.check.varpro;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Stringrepeat {

	public static void main(String[] args) {
		
		String s = "GeeksforGeeks";
		char[] cforstring = s.toCharArray();
		
		Map<Character,Integer> hm = new HashMap<Character, Integer>();
		
		for(Character c : cforstring) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
			
		}
		
		//for()
		
		int temp = 1;
		java.util.Iterator<Entry<Character, Integer>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Character, Integer> mp = itr.next();
			
			if(mp.getValue()>temp) {
				temp = mp.getValue();
			}
			
			System.out.println(mp.getKey() + "-" + mp.getValue());
		}
		System.out.println("temp--"  +  temp);
		System.out.println("=======");
		java.util.Iterator<Entry<Character, Integer>> itr1 = hm.entrySet().iterator();
		while(itr1.hasNext()) {
			Map.Entry<Character, Integer> mp = itr1.next();
			if(mp.getKey()==temp) {
				System.out.println();
			}
			
		}

		
		
	}
}
