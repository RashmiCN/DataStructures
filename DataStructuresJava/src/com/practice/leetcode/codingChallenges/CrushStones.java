package com.practice.leetcode.codingChallenges;

public class CrushStones {
	public static void main(String[] args) {
		int[] stones = {1,3};
		int len = 0;
		stones = sortStone(stones,len);
		
		while(stones.length != 1 ) {
			if(stones.length == 2 && stones[0] == stones[1]) {
				stones[0] = 0;
				stones[1] = 0;
				len = 1;
				stones = sortStone(stones,len);
			} else {
				if(stones[stones.length -1] == stones[stones.length - 2]) {
					len = 2;
					stones = sortStone(stones,len);
				} else {
					stones[stones.length - 2] = stones[stones.length -1] - stones[stones.length - 2];
					len = 1;
					stones = sortStone(stones,len);
				}
			}
		}
	}
	
	static int[] sortStone(int[] stones , int len) {
		int temp=0;
		int[] newArr = new int[stones.length - len];
		for (int i = 0; i < stones.length; i++) {
			for (int j = 0; j < stones.length; j++) {
				if(stones[i] < stones[j]) {
					temp= stones[j];
					stones[j] = stones[i];
					stones[i] = temp;
				}
			}
		}
		for (int i = 0; i < stones.length - len; i++) {
			newArr[i] = stones[i];
		}
		System.out.println("----------------------newArr");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + ", ");
		}
		return newArr;
	}
}
