package com.practice.Array;

public class MaxAndMin {
	public static int maxNum(int[] arr) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static int minNum(int[] arr) {
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,89,100};
		System.out.println(maxNum(arr));
		System.out.println(minNum(arr));
		
		
	}
}
