package com.practice.search;

import java.util.concurrent.RecursiveAction;

public class BinarySearch {
	public static void main(String[] args) {
		int[] ar = {-22,-15,1,7,20,35,55};
		System.out.println(iterativeBS(ar,20));
		System.out.println(iterativeBS(ar,888));
		System.out.println(recusrsiveBS(ar,888));
		System.out.println(recusrsiveBS(ar,20));
	}
	
	public static int iterativeBS(int[] a, int val) {
		int start=0;
		int end = a.length;
		
		while(start < end) {
			int mid = (start + end)/2;
			if(a[mid] == val) {
				return mid;
			} else if(a[mid] < val) {
				// val is greater start to right
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return -1;
	}
	
	
	public static int recusrsiveBS(int[] a, int val) {
		return recusriveBS(a,0,a.length,val);
	}

	private static int recusriveBS(int[] a, int start,int end, int val) {
		// TODO Auto-generated method stub
		if(start>=end) {
			return -1;
		}
		int mp = (start + end) /2;
		if(a[mp] == val) {return mp;}
		else if(a[mp] < val) {return recusriveBS(a,mp+1,end,val);}
		else {return recusriveBS(a,start,mp,val);}
				
		}
}
