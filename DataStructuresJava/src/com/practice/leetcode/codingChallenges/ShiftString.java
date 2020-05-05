package com.practice.leetcode.codingChallenges;

public class ShiftString {
	public static void main(String[] args) {
		String s = "abcdefg";
		String temp1 , temp2;
		int[][] shift =  {{1,1},{1,1},{0,2},{1,3}};
		for (int i = 0; i < shift.length; i++) {
			if(shift[i][0] == 1) {
				temp1 = s.substring(s.length() - shift[i][1], s.length());
				temp2 = s.substring(0,s.length()-shift[i][1]);
				s = temp1+temp2;
			} else {
				temp1 = s.substring(shift[i][1]);
				temp2 = s.substring(0,shift[i][1]);
				s = temp1 + temp2;
			}
		}
		System.out.println(s);
	}
}
