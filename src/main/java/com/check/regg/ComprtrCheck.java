package com.check.regg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComprtrCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1= new User(12,"Hello");
		User u2= new User(12,"Jay");
		User u3= new User(12,"Ram");
		User u4= new User(12,"Nihal");
		User u5= new User(12,"Jayendra");
		
		List<User> li=Arrays.asList(u1,u2,u3,u4,u5);
		System.out.println(li);
		
		Collections.sort(li, new Comparator<User>() {
				
					@Override
					public int compare(User o1, User o2) {
						// TODO Auto-generated method stub
						return o1.getName().compareTo(o2.getName());
						
					}
		});
			
		System.out.println(li);
		System.out.println("java 8");
		
		Collections.sort(li, (p1,p2) -> p1.getName().compareTo(p2.getName()));
		System.out.println(li);
			
	}		
	

}
