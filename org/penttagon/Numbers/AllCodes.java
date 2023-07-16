package org.penttagon.Numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class AllCodes {

	static boolean isArmStrong(int num) {
		int length = count(num);
		int temp = num;
		int rem = 0, sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + power(rem, length);
			num /= 10;
		}
		if (sum == temp)
			return true;
		else
			return false;
	}

	public static int power(int base, int exp) {
		int res = 1;
		for (int i = 1; i <= exp; i++) {
			res = res * base;
		}

		return res;
	}

	public static int count(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}

	static double ccelsiusToFarn(int cel) {
		return (cel * 1.8f) + 32;
	}

	static double farnToCels(double faran) {
		return (faran - 32) * 0.5;
	}

	static int factOfNUm(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}

		return res;
	}

	static int factUsingRecursio(int n) {
		if (n <= 1)
			return 1;
		else
			return n * factUsingRecursio(n - 1);
	}

	static int lcmAndGcd(int x, int y) {
		int gcd = 1;
		for (int i = 1; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0)
				gcd = i;
		}

		int lcm = (x * y) / gcd;
		return lcm;
	}

	static boolean isLeapYear(int year) {

//		if((year%400 == 0) || ((year %100 != 0) && (year%4==0)))
//			return true;
//		else 
//			return false;

		return ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) ? true : false;
	}

	static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static void nPrimeNums(int n) {
		for (int i = 1; i <= n; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
	}

	static int revNum(int n) {
		int rem = 0, rev = 0;

		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		return rev;
	}

	static boolean isPallindomeNum(int n) {
		if (revNum(n) == n)
			return true;
		return false;

	}

	static boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (sum == n)
			return true;
		return false;
	}

	static int sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}

	static void swapWithoutThirdVar(int a, int b) {
		System.out.println(a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
	}

	static void swapNums(int a, int b) {
		System.out.println(a + " " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}

	static String decimalToBinary(int n) {
		String binary = "";
		while (n > 0) {
			int reminder = n % 2;
			binary += reminder;
			n /= 2;
		}
		return binary;
	}

	static int binaryToDecimal(String s) {
		return Integer.parseInt(s, 2);

//		int decimal = 0;
//		int power = 0;
//		for(int i=s.length()-1;i>=0;i--) {
//			int digit = s.charAt(i) - '0';
//			
//			decimal +=  Math.pow(2, power);
//			power++;
//		}
//		return decimal;
	}

	static double squareRoot(double n) {
		double start, end;
		if (n < 1)
			end = 1;
		else
			end = n;
		start = 0;

		while (start < end) {
			double mid = (start + end) / 2;
			if (mid * mid == n) {
				return mid;
			} else if (mid * mid > n)
				end--;
			else
				start++;
		}
		return start;

	}
// -------------------A R R A Y S------------------------------------------------------

	static int[] arrayInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	static void linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("found at " + i);
				System.exit(0);
			}
		}
		System.out.println("Not found");
	}

	static void binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2; // mid = left+(right - left) /2
			if (arr[mid] == target) {
				System.out.println("found at " + mid);
				break;
			} else if (target > arr[mid])
				left = mid + 1;
			else
				right = mid - 1;

		}
		if (left > right)
			System.out.println("not found");
	}

	static void commonInTwoUnsortedArrays(int[] arr1, int[] arr2) {
		// unsorted arrays
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j])
					System.out.print(arr1[i] + " ");
			}
		}
	}

	static void commonIntwoSortedArrays(int[] arr1, int[] arr2) {
		int left = 0;
		int right = 0;

		while (left < arr1.length && right < arr2.length) {
			if (arr1[left] == arr2[right]) {
				System.out.println(arr1[left]);
				left++;
				right++;
			} else if (arr1[left] < arr2[right])
				left++;
			else
				right++;
		}
	}

	static void uniqueInTwoUnsortedArrays(int[] arr1, int[] arr2) {

	}

	static void uniqueInTwoSortedArrays(int[] arr1, int[] arr2) {

	}

	static void uniqueInArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					isUnique = false;
			}
			if (isUnique)
				System.out.println(arr[i]);
		}
	}

	static void commonInArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[i]);
			}
		}
	}

	static void firstDupli(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					System.exit(0);
				}
			}
		}
	}

	static int maxNum(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	static int minNum(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;

	}

	static int missingNum(int[] arr) {
		int n = arr.length + 1;
		int resSum = 0;
		for (int i = 1; i <= n; i++) {
			resSum += i;
		}

		int actuSum = 0;
		for (int i = 0; i < arr.length; i++) {
			actuSum += arr[i];
		}

		return resSum - actuSum;
	}

	static int[] moveAllZeros(int[] arr) {

		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				temp[j] = arr[i];
				j++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				temp[j] = arr[i];
				j++;
			}
		}

		return temp;
	}

	static int[] moveAllNegative(int[] arr) {
		int j = 0;
		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				temp[j] = arr[i];
				j++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		return temp;
	}

	static int noOfDupis(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
		}
		return count;
	}

	static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	static void quickSort(int[] arr, int lowIndex, int highIndex) {

		if (lowIndex >= highIndex)
			return;

		int pivot = arr[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(arr, leftPointer, rightPointer);
		}
		swap(arr, leftPointer, highIndex);
		quickSort(arr, lowIndex, leftPointer - 1);
		quickSort(arr, leftPointer + 1, highIndex);
	}

	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	static int[] revSortedArray(int[] arr) {
		// int temp[] = new int[arr.length];
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return arr;
	}

	static int[] revUnSortedArray(int[] arr) {
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			temp[j] = arr[i];
			j++;
		}
		return temp;
	}

	// rotate array by k position
	static int[] rotateByK(int[] arr, int k) {
		revArray(arr, 0, arr.length - 1);
		revArray(arr, 0, k - 1);
		revArray(arr, k, arr.length - 1);

		return arr;
	}

	static void revArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	static int[] mergeArrays(int[] arr1, int[] arr2) {
		int temp[] = new int[arr1.length + arr2.length];

		int left = 0;
		int right = 0;
		int index = 0;
		while (left < arr1.length && right < arr2.length) {
			if (arr1[left] <= arr2[right]) {
				temp[index] = arr1[left];
				left++;
				index++;
			} else {
				temp[index] = arr2[right];
				right++;
				index++;
			}
		}

		// now add the left-out elements
		while (left < arr1.length) {
			temp[index] = arr1[left];
			left++;
			index++;
		}

		while (right < arr2.length) {
			temp[index] = arr2[right];
			right++;
			index++;
		}

		return temp;
	}

	static void kthSmallestAndMaxNum(int[] arr, int k) {
		// sort the array
		quickSort(arr, 0, arr.length - 1);
		int kthSmall = arr[k - 1];
		int kthMax = arr[arr.length - k];
		System.out.println("kth smalles is " + kthSmall + " " + "kth highest is " + kthMax);
	}

	
	// --------------------------- S T R I N G -------------------------------
	
	static String sortString(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		String res = new String(ch);
		return res;
	}

	static boolean isAnagram(String s1,String s2) {
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
//		sortString(s1);
//		sortString(s2);
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0;i<s1.length();i++)
		{
			if(c1[i] != c2[i])
				return false;
		}
		return true;
	}
	
	static void greetAuser(String name,String greet) {
		System.out.println("Hello "+name+" "+greet);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the greet");
//		String greet = sc.nextLine();
//		System.out.println("Enter the name");
//		String name = sc.next();
//		
//		
//		
//		System.out.println("Hello "+name+" "+greet);
		
		greetAuser("sai", "Good morning");
	}

}
