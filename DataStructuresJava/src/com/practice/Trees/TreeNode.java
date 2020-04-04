package com.practice.Trees;

public class TreeNode {
	int node;
	TreeNode leftChild;
	TreeNode rightChild;
	public TreeNode(int node) {		
		this.node = node;
	}
	
	// if incoming value is first one then insert to node => return the same
	// if incoming value is < node and has no left child we got a place to have the node else call insert again for
	// that node recursively same with right node
	public void insert(int value) {
		if(value == node) {return;}
		if(value < node) {
			if(leftChild ==null) {
				leftChild = new TreeNode(value);
			}
			else {
				leftChild.insert(value);
			}
		} else {
			if(rightChild == null ) {
				rightChild = new TreeNode(value);
			} else {
				rightChild.insert(value);
			}
		}
	}
	
	public void traverseInOrder() {
		if(leftChild != null) {
			leftChild.traverseInOrder();
		}
		System.out.print(node + ",");
		if(rightChild != null) {
			rightChild.traverseInOrder();
		}
	}
	
	public void traversePreOrder() {
		System.out.print(node + ",");
		if(leftChild != null) {
			leftChild.traversePreOrder();
		}
		if(rightChild != null) {
			rightChild.traversePreOrder();
		}
	}
	public void traversePostOrder() {
		if(leftChild != null) {
			leftChild.traversePostOrder();
		}
		if(rightChild != null) {
			rightChild.traversePostOrder();
		}
		System.out.print(node + ",");
	}
	
	
	// if only node  then height is zero
	// if left child is null and right child is null then the heght is zero
	// else the height is 1+ max of recursively callleft and right height
	int height (TreeNode node) {
	    if (node == null) return 0;
	    else if (node.leftChild == null && node.rightChild == null) return 0;
	    return 1 + Math.max (height(node.leftChild), height(node.rightChild));
	}
	
	int depth (TreeNode node) {
	    if (node == null) return 0;
	    int left = depth (node.leftChild);
	    int right = depth (node.rightChild);
	    return (left > right) ? left+1 : right+1;
	 }
	
	public TreeNode get(int value) {
		if(value == node) {
			return this;
		} 
		if(value < node) {
			if(leftChild != null) {
				return leftChild.get(value);
			} 
		} else {
			if(rightChild != null) {
				return rightChild.get(value);	
			}
		}
		return null;
	}
	
	public int min() {
		if(leftChild == null) {
			return node;
		} else {
			return leftChild.min();
		}
	}
	
	public int max() {
		if(rightChild == null) {
			return node;
		} else {
			return rightChild.max();
		}
	}
	
	
	
	public int getNode() {
		return node;
	}
	public void setNode(int node) {
		this.node = node;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "TreeNode [node=" + node + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
	}
	
	
	
}
