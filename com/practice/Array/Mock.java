package com.practice.Array;

import java.util.HashSet;

public class Mock {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5,1, 6 };
		int[] arr2 = {2,3,5,7};
		
		HashSet<Integer> set = new HashSet<>();
		for(int i:arr1)
			set.add(i);
		
		for(int i:arr2)
		{
			if(!set.contains(i))
				set.add(i);
			
		}
		
		for(int y:set)
			System.out.print(y+" ");
	}

}
