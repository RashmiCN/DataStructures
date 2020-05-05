package com.practice.leetcode.codingChallenges;

public class PreOrderTraversal {
	public static void main(String[] args) {
		int[] bt = {8,5,1,7,10,12};
		TreeNode tr = constructBST(bt,0,bt.length-1);
		System.out.println(tr);
	}
	
	static TreeNode constructBST(int[] bt,int start , int end) {
		System.out.println("start: "+ start + "end: "+ end);
		if(start > end) {
			return null;
		}
		TreeNode tn = new TreeNode(bt[start]);
		System.out.println("init" + tn);
		int i;
		for (i = start; i <= end; i++) {
			if(bt[i] > tn.val) {
				break;
			}
		}
		tn.left = constructBST(bt,start+1,	i-1);
		System.out.println("tn.left"+tn);
		tn.right = constructBST(bt,i,end);
		System.out.println("tn.right"+tn);
		System.out.println("****************************************");
		return tn;
	}
	
}


