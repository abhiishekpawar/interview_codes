package com.practice.Array;

import java.util.Random;

public class QuickSort {
	
	public static void quicSort(int[] arr,int lowIndex,int highIndex) {
		
		if(lowIndex >= highIndex) {
			return; //here only one number is remaining so dont need to do anything
		}
		
		int pivot = arr[highIndex];
		int leftPointer = lowIndex;
		int righPointer = highIndex;
		
		while(leftPointer < righPointer) {
			while(arr[leftPointer] <= pivot && leftPointer < righPointer) {
				leftPointer++;
			}
			
			while(arr[righPointer] >= pivot && leftPointer < righPointer) {
				righPointer--;
			}
			
			swap(arr,leftPointer,righPointer);
		}
		
		swap(arr, leftPointer, highIndex);
		quicSort(arr, lowIndex, leftPointer-1);//quick sorting the numbers which are smaller than pivot. lo and rp are pointing at pivot
		quicSort(arr, leftPointer+1, highIndex);
		
	}
	
	static void swap(int[] arr, int index1,int index2) {
		int temp =arr[index1];
		 arr[index1] = arr[index2];
		 arr[index2] = temp;
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random random = new Random();
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = random.nextInt(100); // Random number between 1=100
		}
		
		System.out.println("Before sorting");
		for(int i:arr)
			System.out.print(i+" ");
		
		quicSort(arr, 0, arr.length-1);
		
		System.out.println();
		System.out.println("Aftre sorting");
		for(int i:arr)
			System.out.print(i+" ");
		
	}

}
