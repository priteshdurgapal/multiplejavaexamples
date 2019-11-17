package com.data.structures;

public class MainClassForDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*BSTImpl<Integer> bst = new BSTImpl<Integer>();
		bst.add(11);
		bst.inorder();
		System.out.println("===");
		bst.add(9);
		bst.inorder();
		System.out.println("===");
		bst.add(1);
		bst.inorder();
		System.out.println("===");
		bst.add(2);
		bst.inorder();
		System.out.println("===");
		bst.add(4);
		bst.inorder();
		System.out.println("===");
		bst.add(10);
		bst.inorder();*/
		SLL<Integer> slist = new SLL<Integer>();
		slist.addFirst(4);
		slist.addFirst(1);
		slist.addFirst(41);
		slist.addFirst(2);
		slist.addFirst(56);
		slist.display();
	}

}
