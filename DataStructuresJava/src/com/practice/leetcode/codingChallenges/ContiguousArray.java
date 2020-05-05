package com.practice.leetcode.codingChallenges;

public class ContiguousArray {
	public static void main(String[] args) {
		int[] arr = {1, 0, 0, 1, 0, 1, 1};
		int sum = 0;
		int maxsize = -1;
		int startindex = 0;
		int endindex = 0;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) { 
            sum = (arr[i] == 0) ? -1 : 1;   
            // Consider all subarrays starting from i   
            for (int j = i + 1; j < n; j++) { 
                if(arr[j] == 0)   
                    sum += -1;  
                else
                    sum += 1; 
  
                // If this is a 0 sum subarray, then  
                // compare it with maximum size subarray 
                // calculated so far 
  
                if (sum == 0 && maxsize < j - i + 1)  
                { 
                    maxsize = j - i + 1; 
                    startindex = i; 
                } 
            } 
        }
		endindex = startindex+maxsize-1; 
		System.out.println(maxsize);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
}
