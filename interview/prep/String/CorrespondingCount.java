package interview.prep.String;

//input : Hello World java
// op   : Hello -> 5
//		  World -> 5
//		  java  -> 4

import java.util.*;
public class CorrespondingCount {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		String s = "Hello World java Hello";
		int count = 0;
		
		String[] words = s.split(" ");
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			 
				map.put(word, word.length());
			
		}
		
		for(String s1:map.keySet()) {
			System.out.println(s1+" "+map.get(s1));
		}
			
	}

	
}
