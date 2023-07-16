package com.practice.Array;

import java.util.Arrays;

public class PrintArray {
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5};
		String[] ar = {"Red","Green","Yellow"};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
		//Using Arrays.asList() ----> only objects or nonpremetirev
		System.out.println(Arrays.asList(ar));
		System.out.println();
		System.out.println("----------------------------------------");
		
		//using to string
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(ar));
		
		//Using streams
		Arrays.asList(ar).stream().forEach(s->System.out.println(s));
	}

}
