package interview.prep.String;

import java.util.*;

public class FirstNonRepeted {
	public static void main(String[] args) {
		String s = "aabbdef";
		HashMap<Character,Integer> map = new HashMap<>();
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(map.containsKey(c)) {
				count = map.get(c);
				count++;
				map.replace(c, count);
			}else {
				map.put(c, 1);
			}
		}
		for(char c:map.keySet()) {
			if(map.get(c) == 1) {
				System.out.println(c);
				System.exit(0);
			}
		}
	}

}
