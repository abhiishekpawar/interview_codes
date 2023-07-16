package com.practice.Array;

//best cae ---> O(1)
//worst case -> O(logn)

public class BinarySearch {
	
	public static boolean binarySearch(int[] arr,int x) {
		int left = 0;
		int right = arr.length-1;
		
		while(left<= right) {
			int mid = (left+right)/2;
			if(arr[mid] == x)
				return true;
			else if(x>arr[mid]) {
				left = mid +1;
			}else {
				right = mid-1;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int x = 10;
		System.out.println(binarySearch(arr, x));
		
		
	}

}
