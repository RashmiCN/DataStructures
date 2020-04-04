package com.practice.leetcode.codingChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HappyNumber {
	public static void main(String[] args) {
		int num =2094;
		int temp = num;
//		if(num < 10) {num = num*num;}
		int sum = 0;
		while(num!=1) {
			num = getSqSum(num);
			if(num==temp || num <=3) {
				break;
			}
			if(num < 3) {num = num*num;}
			
		}
		System.out.println(num);
	    if(num ==1) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	}
	public static int getSqSum(int num) {
		int sum=0;
		Integer[] digits = getDigits(num);
		for (int i = 0; i < digits.length; i++) {
			sum += digits[i] * digits[i];
		}
		System.out.println(Arrays.toString(digits));
		System.out.println(sum);
	    return sum;
	}

	public static Integer[] getDigits(int num) {
	    List<Integer> digits = new ArrayList<Integer>();
	    collectDigits(num, digits);
	    return digits.toArray(new Integer[]{});
	}

	private static void collectDigits(int num, List<Integer> digits) {
	    if(num / 10 > 0) {
	        collectDigits(num / 10, digits);
	    }
	    digits.add(num % 10);
	}
}

//class Solution {
//    public boolean isHappy(int n) {
//		return isHappynumber(n);
//    }
//    
//    static int numSquareSum(int n) { 
//        int squareSum = 0; 
//        while (n!= 0) { 
//            squareSum += (n % 10) * (n % 10); 
//            n /= 10; 
//        } 
//        return squareSum; 
//    } 
//    static boolean isHappynumber(int n) { 
//        int slow, fast; 
//        slow = fast = n; 
//        do { 
//            slow = numSquareSum(slow); 
//            fast = numSquareSum(numSquareSum(fast)); 
//        } 
//        while (slow != fast);
//        return (slow == 1); 
//    } 
//}