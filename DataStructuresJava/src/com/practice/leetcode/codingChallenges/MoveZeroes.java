package com.practice.leetcode.codingChallenges;

public class MoveZeroes {
	public static void main(String[] args) {
		int[] a = {0,1,0,3,0,0,0,12};
//		int[] a = {1, 2, 0, 0, 0, 3, 6};
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				System.out.println("temp-"+ temp);
				a[temp++] = a[i];
			}
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + ",");
			}
			System.out.println("iteration---------" + i + "temp-------" + temp);
		}
		while(temp< a.length) {
			a[temp++] = 0;
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + ",");
		}
	}
}
