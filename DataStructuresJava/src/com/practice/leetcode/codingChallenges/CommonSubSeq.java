package com.practice.leetcode.codingChallenges;

public class CommonSubSeq {
	public static void main(String[] args) {
		String text1 = "AGGTAB";
		String text2 = "GXTXAYB";
		char[] t1 = text1.toCharArray();
		char[] t2 = text2.toCharArray();
		int ls1 = text1.length();
		int ls2 = text2.length();
		int len = lcs(t1,t2,ls1,ls2);
		System.out.println(len);
	}
	
	static int lcs(char[] t1,char[] t2,int m, int n) {
		int[][] ms = new int[m+1][n+1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if(i == 0 || j == 0) {
					ms[i][j] = 0;
				} else if(t1[i -1] == t2[j-1]) {
					ms[i][j] = 1 + ms[i-1][j-1];
				} else {	
					ms[i][j] = max(ms[i-1][j],ms[i][j-1]);
				}
			}
		}
		return ms[m][n];
	}
	 	
	static int max(int a, int b) { 
	    return (a > b)? a : b; 
	}
}
