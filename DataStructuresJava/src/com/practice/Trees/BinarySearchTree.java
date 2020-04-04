package com.practice.Trees;

public class BinarySearchTree {
	public static void main(String[] args) {
		Tree tr = new Tree();
		tr.insert(25);
		tr.insert(20);
		tr.insert(15);
		tr.insert(27);
		tr.insert(30);
		tr.insert(29);
		tr.insert(26);
		tr.insert(22);
		tr.insert(32);
		tr.insert(34);
		tr.insert(35);
		tr.insert(36);
		System.out.println(tr.depth());
		System.out.println(tr.height());
		tr.traverseInOrder();
		System.out.println("\n");
		tr.traversePreOrder();
		System.out.println("\n");
		tr.traversePostOrder();
		System.out.println("\n");
		System.out.println(tr.get(15));
		System.out.println(tr.get(20));
		System.out.println(tr.get(32));
		System.out.println(tr.get(26));
		System.out.println(tr.get(34));
		System.out.println(tr.getMin());
		System.out.println(tr.getMax());
	}
}
