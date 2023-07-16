package com.practice.Array;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
	public static void main(String[] args) {
		Stack stack = new Stack();

		int[] arr = { 1, 2, 3 };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) stack.pop();
		}
		System.out.println(Arrays.toString(arr));
	}

}
