package com.practice.Array;

public class MaxDiff {
	public static void main(String[] args) {
		int[] arr= {10,20,2,90,40};
		int res = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				if((arr[i]-arr[j] > res)) {
					res = arr[i]-arr[j];
				}
			}
		}
		System.out.println(res);
	}

}
