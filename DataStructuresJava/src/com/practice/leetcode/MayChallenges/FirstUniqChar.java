package com.practice.leetcode.MayChallenges;

public class FirstUniqChar {
	public static void main(String[] args) {
		String s = " 	";
		int pos = 0;
		int posc = 0;
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if(freq[s.charAt(i) - 'a'] == 1) {
				posc = s.charAt(i);
				pos = i;
				break;
			}
		}
		if(posc == 0) {
			pos = -1;
		}
		System.out.println(pos);
	}
}
