package com.practice.leetcode.codingChallenges;

public class CanJump {
	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		int jumps = nums[0];
		for (int j = 0; j < nums.length; j++) {
			if(jumps <= j && nums[j]== 0) {
				System.out.println("false");
				break;
			}
			System.out.println("j:" + j);
			System.out.println("nums[j]:" + nums[j]);
			System.out.println("jumps" + jumps);
			if(j + nums[j] > jumps) {
				jumps = j + nums[j];
			}
			if(jumps >= nums.length -1) {
				System.out.println("true");
				break;
			}
		}
	}
}
