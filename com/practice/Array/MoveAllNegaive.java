package com.practice.Array;

import java.util.*;
//	input: [-1,-20,30,40,50,-8]
//	ouput: [-1,-20,-8,30,40,50]

public class MoveAllNegaive {
	public static void main(String[] args) {

		int[] arr = { -1, -20, 30, 40, 50, -8 };
		int j = 0;
		int temp[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		for(int y:temp)
			System.out.print(y+" ");
	}

}
