package com.practice.leetcode.codingChallenges;

public class MiddleLinkedList {
	public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { 
          val = x;
          next = null;
      }
   }
	
	public static ListNode middleNode(ListNode head) {
		ListNode[] ln = new ListNode[100];
		int t = 0;
		int mid = 0;
		while(head.next != null) {
			ln[t++] = head;
			head = head.next;
		}
		if(t == 0 || t== 1) {
			return head;
		} 
		if(t%2 == 0) {
			mid = t/2;
			return ln[mid];
		} else {
			mid = (t/2) +1;
			return ln[mid];
		}
	}
}
