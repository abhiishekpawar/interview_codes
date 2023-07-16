package dsa_by_kk;

import java.util.*;

public class Mock1 {
	
	static int sumOfArray(int[] arr) {
		
		int res=0;
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			res += arr[left] + arr[right];
			left++;
			right--;
		}
		if(left==right)
			res+=arr[left];
		return res;
	}
	
	static int[] revrse(int[] arr,int left,int right) {
		 
		
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		
		
		return arr;
	}
	
	static void  Dupli(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	
	static void unique(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					isUnique = false;
				}
			}
			if(isUnique)
				System.out.print(arr[i]+" ");
		}
	}
	
	static boolean specificElem(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target)
				return true;
		}
		return false;
	}
	
	static int secondLargeEle(int[] arr) {
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1)
				max1 = arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max2 && arr[i] != max1)
				max2 = arr[i];
		}
		
		return max2;
	}
	
	static void  kthSmalletANdKthHighst(int[] arr,int k) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("kth smallest" + " "+arr[k-1]);
		System.out.println("kth hihgest" + " "+arr[arr.length - k]);
	}
	
	static boolean isAscending(int[] arr) {
		for(int i=0;i<arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
					return false;
			}
		}
		return true;
	}
	
	static int[] rotateArraysByk(int[] arr,int k) {
		/*
		 * input = [1,2,3,4,5,6,7] k = 3;
		 * step1 : roatate full array - > [7,6,5,4,3,2,1]
		 * step2 = rotate till k ->[5,6,7,4,3,2,1]
		 * step3 = now rotate remaining arrays i.e start from k till length
		 * 
		 */
		
	
		revrse(arr,0,arr.length-1); // step1
		revrse(arr,0,k-1);//step2
		revrse(arr, k, arr.length-1);
		
		return arr;
	}
	
	static int[] mergeSortedArray(int[] arr1,int[] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int temp[] = new int[arr1.length+arr2.length];
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[i]) {
				temp[k] = arr1[i];
				i++;
				k++;
			}else {
				temp[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<arr1.length) {
			temp[k]= arr1[i];
			i++;
			k++;
		}
		
		while(j<arr1.length) {
			temp[k] = arr2[j];
			j++;
			k++;
		}
		return temp;
	}
	
	static void quickSort(int[] arr,int lowIndex,int highIndex) {
		
		if(lowIndex>=highIndex) {
			return;
		}
		
		int pivot = arr[arr.length-highIndex];
		int leftPointer = lowIndex;
		int righPointer = highIndex;
		
		while(leftPointer < righPointer) {
			
			while(arr[leftPointer]<= pivot && leftPointer < righPointer) {
				leftPointer++;
			}
			
			while(arr[righPointer] >= pivot && leftPointer < righPointer) {
				righPointer--;
			}
			
			swap(arr,leftPointer,righPointer);
		}
		swap(arr,leftPointer,highIndex);
		quickSort(arr,lowIndex,leftPointer-1);
		quickSort(arr,leftPointer+1,highIndex);
		
	}
	
	
	static void swap(int[] arr,int index1,int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	
	//	----------------------S T R I N G S -----------------------
	
	static String[] customSplit(String s) {
		
		int index = 0;
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				list.add(s.substring(index,i));
				index = i+1;
			}
		}
		list.add(s.substring(index));
		String[] arr = list.toArray(new String[list.size()]);
		return arr;
	}
	
	static int numofWord(String s) {
		int count=0;
		String[] arr  = customSplit(s);
		for(String a:arr)
			count++;
		return count;
	}
	
	public static void main(String[] args) {
		
		String s = "good morning all";
		System.out.println(numofWord(s));
		
}
}
