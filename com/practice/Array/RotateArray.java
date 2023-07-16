package com.practice.Array;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; // 5 1 2 3 4
		int lastEle=  arr[arr.length-1];
		
		for(int i=arr.length-1;i>=1;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = lastEle;
		System.out.println(Arrays.toString(arr));
	}

}
