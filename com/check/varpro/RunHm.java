package com.check.varpro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RunHm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Map<Integer,String> hmp = new HashMap<Integer, String>();
			hmp.put(1, "hello");
			hmp.put(2, "hello2");
			hmp.put(3, "hello3");
			hmp.put(4, "hello4");
			hmp.put(1, "hello5");
			
			for(Map.Entry<Integer, String> m : hmp.entrySet()) {
				System.out.println(m.getKey() +"-" + m.getValue());
			}
			
			for(Integer m : hmp.keySet()) {
				System.out.println(hmp.get(m)) ;
			}
			
			HashSet<Integer> hsi = new HashSet<Integer>();
			hsi.add(10);
			hsi.add(11);
			System.out.println(hsi);
			hsi.remove(1);
			System.out.println(hsi);
			
			ArrayList<String> als = new ArrayList<String>();
			
			als.add("Ravi");
			als.add("Vijay");
			als.add("RR");
			als.add("SS");
			als.add("AA");
			System.out.println(als);
			ArrayList<String> als2 = new ArrayList<String>();
			als2.add("Ravi");
			als2.add("YY");
			als.removeAll(als2);
			System.out.println(als);
			
	}

}
