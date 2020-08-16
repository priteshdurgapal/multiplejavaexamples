package com.check.treeset;

public class Animal  implements Comparable<Animal> {
	
	private int size;
	private int legs;
	
	
	public Animal(int size, int legs) {
		super();
		this.size = size;
		this.legs = legs;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	Animal(int size){
		this.size=size;
		
	}

	/*@Override
	public int compareTo(Animal o) {
		
		return(this.size<o.size?-1 : this.size>o.size ?1 :0);
	}*/
	@Override
	public int compareTo(Animal o) {
		
		int i=this.legs<o.legs?-1 : this.legs>o.legs ?1 :0;
		if(i==0) 
			return (this.size<o.size?-1 : this.size>o.size ?1 :0);
		else
			return i;
		
	}


	@Override
	public String toString() {
		return "Animal [size=" + size + ", legs=" + legs + "]";
	}

	

	
}
