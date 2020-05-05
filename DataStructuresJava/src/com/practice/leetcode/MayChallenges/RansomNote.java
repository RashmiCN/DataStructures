package com.practice.leetcode.MayChallenges;

public class RansomNote {
	public static void main(String[] args) {
		String ransomNote = "aa";
		String magazine = "aba";
		
		if(ransomNote.trim().length() == 0) {
			System.out.println("true");
		}
		
		if(magazine.trim().length() == 0 ) {
			System.out.println("false");
		}
		
		int freq[] = new int[26];
		
		for (int i = 0; i < magazine.length(); i++) {
			int idx = magazine.charAt(i) - 'a';
			freq[magazine.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < ransomNote.length(); i++) {
			if(--freq[magazine.charAt(i) - 'a'] < 0) {
//				return false;
			}
		}
	
	}
}
