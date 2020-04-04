package com.practice.sorts;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {-8,4,3,1,6,2,1,8,5,7,-7};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +"," );
		}
	}
	
	
}
