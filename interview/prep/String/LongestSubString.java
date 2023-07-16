package interview.prep.String;

/*		First Longest SubString
 * 		input : "abcdab"
 * 
 * 			abcd ------------->OP
 * 			bcda
 * 			cdab
 
 */

import java.util.*;

public class LongestSubString {

	public static void main(String[] args) {
		HashSet<Character> set = new HashSet<>();
		String s = "abcdab";
		String longestTillNow = "";
		String longestOverAll = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (set.contains(c)) {
				longestTillNow = "";
				set.clear();
			} else {
				set.add(c);
				longestTillNow += c;
				if (longestTillNow.length() > longestOverAll.length())
					longestOverAll = longestTillNow;
			}

		}
		System.out.println(longestOverAll);
	}
}
