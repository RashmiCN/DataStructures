package com.practice.Trees;

public class Tree {
	
	TreeNode root;
	
	public void insert(int value) {
		if(root == null) {
			root= new TreeNode(value);
		} else {
			root.insert(value);
		}
	}
	
	public void traverseInOrder() {
		if(root != null) {
			root.traverseInOrder();
		}
	}
	
	public void traversePreOrder() {
		if(root != null) {
			root.traversePreOrder();
		}
	}
	
	public void traversePostOrder() {
		if(root != null) {
			root.traversePostOrder();
		}
	}
	
	public TreeNode get(int value) {
		if(root != null) {
			return root.get(value);
		} 
		return null;
	}
	
	public int getMin() {
		if(root==null) {
			return Integer.MIN_VALUE;
		} else {
			return root.min();
		}
	}
	
	public int getMax() {
		if(root==null) {
			return Integer.MIN_VALUE;
		} else {
			return root.max();
		}
	}
	
	public int depth() {
		return root.depth(root);
	}
	public int height() {
		return root.height(root);
	}
	
}
