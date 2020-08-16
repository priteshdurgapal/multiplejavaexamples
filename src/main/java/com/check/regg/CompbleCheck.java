package com.check.regg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompbleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person u1= new Person(12,"Hello");
		Person u2= new Person(10,"Jay");
		Person u3= new Person(11,"Ram");
		Person u4= new Person(9,"Nihal");
		Person u5= new Person(13,"Jayendra");
		
		List<Person> li=Arrays.asList(u1,u2,u3,u4,u5);
		System.out.println(li);
		
		Collections.sort(li);

		System.out.println(li);
	}

}
