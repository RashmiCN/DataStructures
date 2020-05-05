package com.practice.leetcode.codingChallenges;

import java.util.Stack;

public class BackSpaceChar {
	public static void main(String[] args) {
		String S = "a##c";
		String t = "#a#c";
		S = getBackSpace(S);
		
	}
	
	static String getBackSpace(String S) {
		Stack<Character> q = new Stack<Character>();  
		  
	    for (int i = 0; i < S.length(); ++i) {  
	        if (S.charAt(i) != '#')  
	            q.push(S.charAt(i));  
	        else if (!q.isEmpty())  
	            q.pop();  
	    }  	  
	    // build final string  
	    String ans = ""; 	  
	    while (!q.isEmpty()) {  
	        ans += q.pop();  
	    }  	  
	    // return final string  
	    String answer = ""; 
	    for(int j = ans.length() - 1; j >= 0; j--) 
	    { 
	        answer += ans.charAt(j); 
	    } 
	    System.out.println(answer);
	    return answer;
	}
}
