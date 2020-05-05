package com.practice.sorts;

public class MergeSort {
	public static void main(String[] args) {
		int[] inArr = 	{20,35,-15,7,55,1,-22};
		mergeSort(inArr, 0, inArr.length);
		System.out.println("result=========================================ss");
		displayarr(inArr, inArr.length);
	}
	
	public static void mergeSort(int[] input, int start, int end) {
		if((end - start) <2 ) {
			return;
		}
		
		int mid = (start + end)/2;
		mergeSort(input,start , mid);
		mergeSort(input,mid, end);
		merge(input, start,mid,end);
	}
	private static void displayarr(int[] arr, int len) {
		for (int k = 0; k < len; k++) {
			System.out.print(arr[k] + " , ");
		}
		System.out.println();
	}
	
	private static void merge(int[] input, int start, int mid, int end) {
		
		if(input[mid-1] <= input[mid]) {
			return;
		}
		
		int i = start;
		int j= mid;
		int tempInd = 0;
		System.out.println("--------------------merge starts ----------------------------");
		System.out.println("start" + start);
		System.out.println("mid" + mid);
		int[] temp = new int[end-start];
		while(i < mid && j < end) {
			temp[tempInd++] = (input[i] <= input[j]) ? input[i++] :input[j++];
		}
	
//		displayarr(input, i);
//		displayarr(input, start+tempInd);
		displayarr(temp, temp.length);
		displayarr(input, input.length);
		System.out.println("**********************************");
		System.arraycopy(input,i,input, start+tempInd,mid-i);
		System.arraycopy(temp, 0, input, start, tempInd);
//		System.arraycopy(src, srcPos, dest, destPos, length);
		displayarr(temp, temp.length);
		displayarr(input, input.length);
		System.out.println("**********************************");
	}
	
	
}
