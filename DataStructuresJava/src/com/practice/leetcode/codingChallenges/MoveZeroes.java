package com.practice.leetcode.codingChallenges;


/*
 	Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order 
 	of the non-zero elements.

	Example:
	
	Input: [0,1,0,3,12]
	Output: [1,3,12,0,0]
	Note:
	
	You must do this in-place without making a copy of the array.
	Minimize the total number of operations.
 */
public class MoveZeroes {
	public static void main(String[] args) {
		int[] a = {0,1,0,3,0,0,0,12};
		int temp = 0;
		
		// have a temp index and save all non zeroes
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				a[temp++] = a[i];
			}
		}
		
		// rest - till length fill zeroes
		while(temp< a.length) {
			a[temp++] = 0;
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + ",");
		}
	}
}
