package com.practice.Array;

import java.util.*;

public class Duplicats {
	public static void main(String[] args) {
		
		int arr[] = {4,2,3,5,1,2,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i] +" ");
				}
			}
		}
	}

}
