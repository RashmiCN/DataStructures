package com.practice.recursion;

public class MergeSort {
	public static void main(String[] args) {
		
	}
	
	public static void mergeSort(int[] inptArr, int start, int end) {
		int mid = (start + end) / 2;
		mergeSort(inptArr, start, mid);
		mergeSort(inptArr, mid, end);
		merge(inptArr, start , mid, end);
	}
	
	public static void merge(int[] inputArr, int start, int mid, int end) {
		if(inputArr[mid-1] <= inputArr[mid]) {
			return;
		}
		int i = start;
		int j = mid;
		int tempI = 0;
		
		int[] temp = new int[end-start];
		if(i<mid && j<end) {
			
		}
	}
}
