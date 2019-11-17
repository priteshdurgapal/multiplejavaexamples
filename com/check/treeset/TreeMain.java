package com.check.treeset;

import java.util.Set;
import java.util.TreeSet;


public class TreeMain {

	public static void main(String[] args) {
		
		//Set<Animal> ts= new TreeSet<Animal>();
		Set<Animal> ts= new TreeSet<Animal>();
		Animal cat=new Animal(5,3);
		Animal dog=new Animal(6,4);
		Animal horse=new Animal(9,9);
		Animal tiger=new Animal(5,6);
		Animal camel=new Animal(3,7);
		Animal ne=new Animal(1,1);
		
		ts.add(ne);
		ts.add(camel);
		ts.add(tiger);
		ts.add(horse);
		ts.add(dog);
		ts.add(cat);
		/*Set<Integer> ts=new TreeSet<Integer>();
		ts.add(2);
		ts.add(1);
		ts.add(34);
		ts.add(22);*/
		System.out.println(ts.size());
		System.out.println(ts);
		for (Animal animal : ts) {
			
			System.out.println(animal.hashCode());
		}

	}

	
	

}
