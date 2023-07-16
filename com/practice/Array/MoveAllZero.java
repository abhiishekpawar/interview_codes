package com.practice.Array;

import java.util.Arrays;

public class MoveAllZero {
	public static void main(String[] args) {
		
		int[] arr = {10,0,0,20,40,50,0,60}; // --->[10, 20, 40, 50, 60, 0, 0, 0]
		
		int[] temp = new int[arr.length];
		int j = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]> 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		
		
		System.out.println(Arrays.toString(temp));
	}

}
