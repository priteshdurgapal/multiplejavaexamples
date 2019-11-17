package com.data.structures;

public class BSTImpl<E> {

	 class Node<E>{
		public Node(int value2) {
			// TODO Auto-generated constructor stub
			value=value2;
			right=null;
			left=null;
		}
		Node<E> left;
		Node<E> right;
		int value;
	}
	
	Node<E> root;
	
	private Node<E> addRecursively(Node<E> current, int value) {
		
			if(current==null) {
				current = new Node<E>(value);
				return current;
			}
			if(value<current.value) {
				current.left = addRecursively(current.left, value);
			}
			if(value>current.value){
				current.right = addRecursively(current.right, value);
			}
		 
		return current;
		
	}
	public void add(int value) {
		root = addRecursively(root, value);
	}
	
	
	private void inOrderRecurse(Node node) {

		if(node!=null) {
			inOrderRecurse(node.left);
		
		System.out.println(node.value);
		inOrderRecurse(node.right);
		}
	}
	public void inorder() {
		inOrderRecurse(root);
	}
	

}


