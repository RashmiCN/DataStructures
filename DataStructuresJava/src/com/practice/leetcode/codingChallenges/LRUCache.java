package com.practice.leetcode.codingChallenges;

import java.util.HashMap;
class Entry {
	int value;
	int key;
	Entry left;
	Entry right;
}
public class LRUCache {
	
	HashMap<Integer,Entry> lru;
	int capacity;
	Entry start, end;
	
	public LRUCache(int capacity) {
	      	lru = new HashMap<Integer,Entry>();
	      	this.capacity = capacity;
    }
	
    
    public int get(int key) {
        if(lru.containsKey(key)) {
        	Entry e = lru.get(key);
        	removeNode(e);
			addAtTop(e);
			return e.value;
        }
        return -1;
    }
    

    public void put(int key, int value) {
        if(lru.containsKey(key)) {
        	Entry entry = lru.get(key);
			entry.value = value;
			removeNode(entry);
			addAtTop(entry);
        } else {
        	Entry newnode = new Entry();
			newnode.left = null;
			newnode.right = null;
			newnode.value = value;
			newnode.key = key;
			if (lru.size() > capacity) // We have reached maxium size so need to make room for new element.
			{
				lru.remove(end.key);
				removeNode(end);				
				addAtTop(newnode);

			} else {
				addAtTop(newnode);
			}

			lru.put(key, newnode);
        }
    }
    
    public void addAtTop(Entry node) {
		node.right = start;
		node.left = null;
		if (start != null)
			start.left = node;
		start = node;
		if (end == null)
			end = start;
	}

	public void removeNode(Entry node) {

		if (node.left != null) {
			node.left.right = node.right;
		} else {
			start = node.right;
		}

		if (node.right != null) {
			node.right.left = node.left;
		} else {
			end = node.left;
		}
	}
	
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		LRUCache lrucache = new LRUCache(10);
		lrucache.put(1, 1);
		lrucache.put(10, 15);
		lrucache.put(15, 10);
		lrucache.put(10, 16);
		lrucache.put(12, 15);
		lrucache.put(18, 10);
		lrucache.put(13, 16);

		System.out.println(lrucache.get(1));
		System.out.println(lrucache.get(10));
		System.out.println(lrucache.get(15));

	}
}
