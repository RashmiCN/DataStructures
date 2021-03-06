package com.practice.leetcode.codingChallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramGrouping {
	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> anagram = groupAnagrams(strs);
		anagram.forEach(action -> {
			System.out.println(action);
		});
	}
	static List<List<String>> groupAnagrams(String[] strs){
		List<List<String>> result = new ArrayList<List<String>>();
		 
	    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	    for(String str: strs){
	        char[] arr = new char[26];
	        for(int i=0; i<str.length(); i++){
	            arr[str.charAt(i)-'a']++;
	        }
	        String ns = new String(arr);
	        System.out.println(ns);
	        if(map.containsKey(ns)){
	            map.get(ns).add(str);
	        }else{
	            ArrayList<String> al = new ArrayList<String>();
	            al.add(str);
	            map.put(ns, al);
	        }
	    }
	 
	    result.addAll(map.values());
	 
	    return result;
	}
}
