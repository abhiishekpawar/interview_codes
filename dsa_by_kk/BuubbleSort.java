package dsa_by_kk;

import java.util.Arrays;

public class BuubbleSort {
	
	static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-i;j++)
			{
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {5,3,2,10};
		
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
