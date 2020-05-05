package com.practice.leetcode.MayChallenges;

public class NumberComplement {
	public static void main(String[] args) {
		int num = 15;
		System.out.println(Integer.highestOneBit(num));
			int mask = (Integer.highestOneBit(num) << 1) - 1;
		    int res =  num ^ mask;
	    System.out.println(res);
	}
}
