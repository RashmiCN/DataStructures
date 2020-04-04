package com.practice.sorts;


/**
 * assume first element (0th) is sorted part of array
 * from 1st element go on looking for smallest comparred to 1st , once found swqap 
 * @author rashm
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {20,35,-15,7,-22,1,55};
		for (int lastUnsorted = arr.length -1; lastUnsorted > 0; lastUnsorted--) {
			System.out.println(arr[lastUnsorted] + "lus");
			int largest = 0;
			for (int i = 1; i <= lastUnsorted; i++) {
				System.out.println(arr[i] + "inner");
				if(arr[i]>arr[largest]) {
					largest = i;
				}
			}
			int temp = arr[lastUnsorted];
			arr[lastUnsorted] = arr[largest];
			arr[largest] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("next---------------------------------------------------");
		int[] arr1 = {20,35,-15,7,-22,1,55};
//		int[] arr1 = {64,25,12,22,11};
		for (int i = 0; i < arr1.length-1; i++) {
			System.out.print(arr1[i]+ "lus");
			int min = i;	
			for (int j = i+1; j < arr1.length; j++) {
				if(arr1[j]<arr1[min]) {
					System.out.println(arr1[j] + "inner");
					min = j;
				}
			}
			int temp = arr1[min];
			arr1[min] = arr1[i];
			arr1[i] = temp;
		}
		System.out.println(" ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ",");
		}
		
		// One by one move boundary of unsorted subarray 
        for (int i = 0; i < arr1.length-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < arr1.length; j++) 
                if (arr1[j] < arr1[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr1[min_idx]; 
            arr1[min_idx] = arr1[i]; 
            arr1[i] = temp; 
        }
        System.out.println(" ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ",");
		}
	}
}
