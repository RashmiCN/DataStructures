package com.practice.leetcode.codingChallenges;

public class DiameterBintree {
	 public int diameterOfBinaryTree(TreeNode root) {
	        if (root == null)
	        return 0;

	        int rootDiameter = getHeight(root.left) + getHeight(root.right) ;
	        int leftDiameter = diameterOfBinaryTree(root.left);
	        int rightDiameter = diameterOfBinaryTree(root.right);

	        return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
	    }
	    
	    

	    public static int getHeight(TreeNode root) {
	    if (root == null)
	        return 0;

	    return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	    }
}
