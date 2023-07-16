package com.practice.Array;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,7,8,9,10};
		
		int expNoOfEle = arr.length+1;
		int total_sum = 0;
		
		total_sum = (expNoOfEle *(expNoOfEle+1))/2; 	//---------->   (n*(n+1))/2
		
		int presentSum = 0;
		for(int i:arr)
			presentSum +=i;
		
		System.out.println("Missing number is "+" "+(total_sum - presentSum));
	}

}
