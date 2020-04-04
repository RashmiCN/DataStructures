package com.practice.recursion;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20,35,-15,7,-22,1,55};
//		int[] arr = {5, 9, 4, 6, 5, 3};
		QuickSort qs = new QuickSort();
		qs.quickSort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		int k = 0;
		int y= 0;
		System.out.println("");
	}
	
	public void quickSort(int[] a, int beg, int end) {
		if(beg<end) {
			int partIdx = partition(a,beg,end);
			quickSort(a,beg,partIdx-1);
			quickSort(a,partIdx+1,end);
		}
	}

	// Arrays.sort() uses QuickSort and o(logn) time. 
	private int partition(int[] a, int beg, int end) {
		// TODO Auto-generated method stub
		// we are going to pivot from the end
		int pivot = a[end];
		int i = beg-1;
		for (int j = beg; j <= end-1; j++) {
			if(a[j] < pivot) {
				i++;
				int swapTemp = a[i];
	            a[i] = a[j];
	            a[j] = swapTemp;
			}
		}
		System.out.println("");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + ",");
		}
		int swapTemp = a[i+1];
	    a[i+1] = a[end];
	    a[end] = swapTemp;
		System.out.println("");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + ",");
		}
		System.out.println("");
		return i+1;
	}
}
