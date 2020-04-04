package com.practice.codingChallenges;

public class RotateLeftArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int count = 4;
		RotateLeftArray rl = new RotateLeftArray();
		
		int[] rotArr = rl.rotateLeft(a,count);
	}

	private int[] rotateLeft(int[] a, int count) {
		int i,temp = 0;
		for (int j = 0; j < count; j++) {
			temp = a[0];
			for (i= 0; i < a.length-1; i++) {				
				a[i] = a[i+1] ;
			}
			a[a.length-1] = temp;
		}
		
		return a;
		
	} 
}
