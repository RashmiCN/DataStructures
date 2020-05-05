package com.practice.recursion;

public class MergeSort {
	public static void main(String[] args) {
		int[] inArr = 	{20,35,-15,7,55,1,-22};
		mergeSort(inArr, 0, inArr.length);
		
	}
	
	public static void mergeSort(int[] inptArr, int start, int end) {
		if((end - start) <2 ) {
			return;
		}
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
		while(i<mid && j<end) {
			temp[tempI++] = (inputArr[i]<=inputArr[j]) ? inputArr[i++] : inputArr[j++];
		}
//		System.out.println("i<Start>  "  + i + "  j <mid>  " + j + " tempi " + tempI);
		System.arraycopy(inputArr, i, inputArr, start+tempI, mid -i);
		System.arraycopy(temp, 0, inputArr, start,tempI);
		for (int k = 0; k < inputArr.length; k++) {
			System.out.print(inputArr[k] + " , ");
		}
		System.out.println();
	}
}
