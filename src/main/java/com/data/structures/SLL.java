package com.data.structures;

//import com.data.structures.SLL.Node;

public class SLL<E> {

	private static class Node<E>{
		private Node<E> next;
		private E element;
		public Node(Node<E> n, E e) {
			next=n;
			element=e;
		}
	}
		int size=0;
		private Node<E> head =null;
		private Node<E> tail = null;
		public int size() {return size;}
		public void addFirst(E e) {
			
			head = new Node<E>(head,e);
			if(size==0) {
				tail=head;
			}
			size++;
		}
		public E pop() {
			E answer = (E)head.next;
			head = head.next;
			size--;
			return answer;
		}
		
		public void display() {
			Node<E> temp = head;
			while(temp!=null) {
				System.out.println(temp.element);
				temp = temp.next;
			}
		}
		
}

