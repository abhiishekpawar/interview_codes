package com.practice.Array;

import java.util.*;
public class FirstDuplicate {
	
	public static int firstDupli(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i:arr) {
			if(set.contains(i))
				return  i;
			else
				set.add(i);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,10,4,2,6};
		
		//METHOD1
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i] == arr[j]) {
//					System.out.println(arr[i]);
//					System.exit(0);
//				}
//			}
//		}
		
		
		int ans = firstDupli(arr);
		System.out.println("ans is "+ans);
	
		
	}

}
