package com.practice.Array;

public class CommonElementsInTwoArray {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arrr2 = {3,4,5};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arrr2.length;j++) {
				if(arr1[i] == arrr2[j])
					System.out.println(arr1[i]);
			}
		}
	}

}
