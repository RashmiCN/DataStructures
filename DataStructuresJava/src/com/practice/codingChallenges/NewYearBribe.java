package com.practice.codingChallenges;

public class NewYearBribe {
	public static void main(String[] args) {
		int bribeCount = 0;
        int temp = 0;
//        int[] q = {5, 1, 2, 3, 7, 8, 6, 4};
        int[] q = { 1, 2, 3, 5,4, 6,7,8};
        for(int i =q.length-1 ; i>=0;i--){
        	System.out.println("q["+i+"]"+q[i]);
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            System.out.println("---------------------------------------------");
            for (int j = Math.max(0, q[i] - 2); j < i; j++){
            	System.out.println("q["+j+"]="+ q[j]+"q["+i+"]="+ q[i]);
                if (q[j] > q[i]) bribeCount++;
            }
        }
        System.out.println(bribeCount);
	}
}
