package com.practice.Array;

import java.util.Arrays;

public class UniqueElement {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,2,3,5};
		for(int i=0;i<arr.length;i++) {
			boolean isUnique = true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if(isUnique)
				System.out.print(arr[i]+" ");
		}
	}

}

/*
 * public static void main(String[] args) {
		int[] arr = {3,2,6,2,8,6,9}; 
		// 2,6
		//3,2,6,8,9
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Duplicates are");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j])
					System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
		
		System.out.println("Unique are");
		for(int i=0;i<arr.length;i++) {
			boolean isUnique = true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if(isUnique)
				System.out.print(arr[i]+" ");
		}
		
	}
	*/
