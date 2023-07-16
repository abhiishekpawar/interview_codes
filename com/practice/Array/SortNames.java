package com.practice.Array;

import java.util.Arrays;

public class SortNames {
	public static void main(String[] args) {
		
		String[] names = {"Banana","Grapes","Apple"};
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if((names[i].compareTo(names[j]))>0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(names));
	}

}
