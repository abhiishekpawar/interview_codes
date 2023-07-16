package interview.prep.String;
//print in descending order wrt freequency

// input : banana
// output : b ->1
//			a ->3
//			n ->2
// output should be : a n b

import java.util.*;
import java.util.Map.Entry;

public class DescendingOrderCHars {
	
	public static void main(String[] args) {
		String s = "banana";
		HashMap<Character, Integer> map = new HashMap<>();
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				count = map.get(ch);
				count++;
				map.replace(ch, count);
			}else {
				map.put(ch, 1);
			}
		}
		Set<Entry<Character, Integer>> set = map.entrySet(); 
		ArrayList<Entry<Character,Integer>> list = new ArrayList<Entry<Character,Integer>>(set);
		System.out.println(list);
		
	}

}
