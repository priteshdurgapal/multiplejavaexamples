package com.data.structures;

//import com.data.structures.StackUsingSL.StackUsingLinkedlist;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create Object of Implementing class 
		SinglyLinkedLL<Integer> obj = new SinglyLinkedLL<Integer>(); 
        // insert Stack value 
        obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 
  
        // print Stack elements
        System.out.println("after push");
        obj.display(); 
        // Delete top element of Stack 
        obj.pop(); 
        obj.pop(); 
        System.out.println("after pop");
        // pritn Stack elements 
        obj.display(); 

	}

}
