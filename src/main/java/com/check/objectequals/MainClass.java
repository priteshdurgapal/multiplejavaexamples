package com.check.objectequals;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1= new Employee("Pritesh");
		Employee e2=new Employee("Pritesh");
		System.out.println(e1.equals(e2));
		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = s2.intern();
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s2==s4);
	}

}
