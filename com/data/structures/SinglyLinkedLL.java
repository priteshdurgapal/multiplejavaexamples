package com.data.structures;

//import com.data.structures.SinglyLinkedLL.Node;

public class SinglyLinkedLL<E> {
	  //---------------- nested Node class ----------------
		 private static class Node<E> { 
		 private E element; // reference to the element stored at this node
		 
	     private Node<E> next; // reference to the subsequent node in the list
		 public Node(E e, Node<E> n) 
		 { element = e;
		   next = n;
		 } 
		 public E getElement() { return element; } 
		 public Node<E> getNext() { return next; } 
		// public void setNext(Node<E> n) { next = n; } 
		} //----------- end of nested Node class -----------
		 
		 private Node<E> head = null;
		 private Node<E> tail=null;
		 private int size = 0;
		 public SinglyLinkedLL() {
			 
		 }
		 public int size( ) { return size; }
		//public void addFirst(E e)
		 public void push(E e) {
			 head=new Node<>(e,head);
			 if(size==0)
				 tail=head;
			 size++;
		 }
		
		 //public E removeFirst()
		 public E pop() {
			 
			
			 E answer = head.getElement();
			 head = head.getNext();
			 size--;
			 if (size == 0)
				 tail = null;
			 return answer;
		 }
		 
		 public void display() 
		    { 
		        // check for stack underflow 
		        if (head == null) { 
		            System.out.printf("\nStack Underflow"); 
		            //exit(1); 
		        } 
		        else { 
		            Node<E> temp = head; 
		            while (temp != null) { 
		  
		                // print node data 
		                System.out.printf("%d->", temp.element); 
		  
		                // assign temp link to temp 
		                temp = temp.next; 
		            } 
		        } 
		 
}
		 
}


