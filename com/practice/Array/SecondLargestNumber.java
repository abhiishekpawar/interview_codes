package com.practice.Array;

public class SecondLargestNumber {
	public static void main(String[] args) {
		
		int arr[] = {10,203,54,343 };
		int max1 = arr[0];
		int max2 = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1)
				max1 = arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max2 && arr[i] != max1) {
				max2 = arr[i];
			}
		}
//		System.out.println("max 1 is "+" "+max1);
		System.out.println("max 2 is "+" "+max2);
	}

}
