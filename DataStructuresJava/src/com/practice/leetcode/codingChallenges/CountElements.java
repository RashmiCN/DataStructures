package com.practice.leetcode.codingChallenges;

public class CountElements {
	public static void main(String[] args) {
		int[] num = {1,2,3};
		System.out.println(countElements(num));
	}
	
	static int countElements(int[] arr) {
        int count = 0;
        int plus1 = 0;
        for (int i = 0; i < arr.length; i++) {
        	plus1 = arr[i]+1;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] == plus1) {
					count++;
					break;
				}
			}
		}
        return count;
    }
}
