package com.practice.leetcode.codingChallenges;

public class SelfLessProduct {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] res = new int[nums.length];
		int temp = 1;
//		Take 1
//		for (int i = 0; i < res.length; i++) {
//			res[i] = 1;
//			for (int j = 0; j < res.length; j++) {
//				if(j!=i) {
//					res[i] *= nums[j];
//				}
//			}
//		}
//		for (int i = 0; i < res.length; i++) {
//			System.out.println(res[i]);
//		}
//      Take 2
		for (int i = 0; i < res.length; i++) {
			res[i] = 1;
		}
//		for (int i = 0; i < nums.length; i++) 
//            System.out.print(res[i] + "*"); 
//		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			res[i]  = temp;
			temp*= nums[i];
			System.out.println("--#--" + temp + " --#--"+ res[i]);
			for (int j = 0; j < nums.length; j++) 
	            System.out.print(res[j] + ",");
		}
		temp =1; 
		System.out.println("***********************************");
		for (int i = nums.length -1 ; i >= 0; i--) {
			System.out.println("----" + temp + " -----"+ res[i]);
			res[i]  *= temp;
			temp*= nums[i];
			for (int j = 0; j < nums.length; j++) 
	            System.out.print(res[j] + ",");
		}
//		System.out.println();
//		for (int i = 0; i < nums.length; i++) 
//            System.out.print(res[i] + "-"); 
	}
		
		
}
