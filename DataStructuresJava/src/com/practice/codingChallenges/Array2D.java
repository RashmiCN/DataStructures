package com.practice.codingChallenges;

public class Array2D {
	
	public static void main(String[] args) {
		Array2D a2d = new Array2D();
		int[][] a = {{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}};
		System.out.println(a2d.hourGlasssSum(a));
	}

	private int hourGlasssSum(int[][] a) {
		int sum = Integer.MIN_VALUE;
		int top,mid,bot = 0;
		for (int k = 0; k < 4; k++) {
			for (int m = 0; m < 4; m++) {
				System.out.println("------------------------------");
				top = a[k][m]+a[k][m+1] +a[k][m+2];
				mid= a[k+1][m+1];
				bot = a[k+2][m]+a[k+2][m+1] +a[k+2][m+2];
				System.out.println(top+mid+bot);
				if(top+mid+bot > sum) {sum=top+mid+bot;}
			}
		}	
		return sum;
	}


}
