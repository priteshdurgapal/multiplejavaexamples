package com.check.regg;

public class Person implements Comparable<Person>{
	private int id;
	private String name;
	
	Person(int id, String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.id - o.getId();
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
