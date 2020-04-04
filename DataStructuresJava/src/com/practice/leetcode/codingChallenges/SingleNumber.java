package com.practice.leetcode.codingChallenges;

public class SingleNumber {
	public static void main(String[] args) {
		int[] a = {1,2,4,1,2};
		System.out.println(singleOccur(a));
	}
	static int singleOccur(int[] a) {
		int res = a[0];
		for (int i = 1; i < a.length; i++) {
			res = res ^ a[i];
			System.out.println("xor----------" + res);
		}
		return res;
	}
}
