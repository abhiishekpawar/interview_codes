package dsa_by_kk;

import java.util.Arrays;

public class MergeTwoSortedArray {
	
	static int[] merge(int[] arr1,int[] arr2) {
		
		int n = arr1.length;
		int m = arr2.length;
		int[] temp = new int[n+m];
		int k=0;
		
		int i=0,j=0;
		while(i<n && j<m) {
			
			if(arr1[i] < arr2[j]) {
				temp[k] = arr1[i];
				i++;
				k++;
			}else {
				temp[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		//now add the remaining elements 
		while(i<arr1.length) {
			temp[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length) {
			temp[k] = arr2[j];
			j++;
			k++;
		}
		
		return temp;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,3,4,5};
		int[] arr2 = {2,4,6,8};
		
		System.out.println(Arrays.toString(merge(arr1, arr2)));
	}

}
