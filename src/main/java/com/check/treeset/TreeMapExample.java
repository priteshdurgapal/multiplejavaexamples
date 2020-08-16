package com.check.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
 
public class TreeMapExample {
 
    public static void main(String a[]){
        //By using name comparator (String comparison)
        //TreeMap<Empl,String> tm = new TreeMap<Empl, String>(new MyNameComp());
    	TreeMap<Empl,String> tm = new TreeMap<Empl, String>();
        tm.put(new Empl("Ram",3000), "RAM");
        tm.put(new Empl("John",6000), "JOHN");
        tm.put(new Empl("Crish",2000), "CRISH");
        tm.put(new Empl("Tom",2400), "TOM");
        /*Set<Empl> keys = tm.keySet();
        for(Empl key:keys){
            System.out.println(key+" ==> "+tm.get(key));
        }*/
        /*Iterator<Entry<Empl, String>> itr = tm.entrySet().iterator();
        while (itr.hasNext()) {
        	Map.Entry<Empl, String> pair = (Map.Entry<Empl, String>)itr.next();
        	
        	System.out.println(pair.getKey() +"==>" + pair.getValue());
        }*/
        for(Map.Entry<Empl, String> entry: tm.entrySet()) {
        	
        	System.out.println(entry.getKey() + entry.getValue());
        	
        }
        //Map.Entry<Empl, String> metr = tm.entrySet();
        //for
        System.out.println("===================================");
        //By using salary comparator (int comparison)
       // TreeMap<Empl,String> trmap = new TreeMap<Empl, String>(new MySalaryComp());
        TreeMap<Empl,String> trmap = new TreeMap<Empl, String>();
        trmap.put(new Empl("Ram",3000), "RAM");
        trmap.put(new Empl("John",6000), "JOHN");
        trmap.put(new Empl("Crish",2000), "CRISH");
        trmap.put(new Empl("Tom",2400), "TOM");
        Set<Empl> ks = trmap.keySet();
        for(Empl key:ks){
            System.out.println(key+" ==> "+trmap.get(key));
        }
    }
}




