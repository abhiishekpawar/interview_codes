package com.practice.Array;

import java.util.Arrays;

public class SortArray {
	
	public static int[] ascenArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static int[] descenArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {1,4,2,5,66,6};
		
		
		
		int[] arr1 = ascenArray(arr);
		for(int y:arr1)
			System.out.print(y+" ");
		
		System.out.println();
		int arr2[] = descenArray(arr);
		for(int x:arr1)
			System.out.print(x+" ");
	}
	

}
