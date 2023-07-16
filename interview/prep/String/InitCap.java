package interview.prep.String;

import java.util.*;
public class InitCap {
	public static List<String> mySplit(String words){
		ArrayList<String> list = new ArrayList<>();
		int i=0;
		int index = 0;
		
		for(i=0;i<words.length();i++) {
			char ch =words.charAt(i);
			if(ch == ' ') {
				list.add(words.substring(index,i));
				index = i+1;
			}
		}
		list.add(words.substring(index));
		return list;
	}
	
	
	public static void main(String[] args) {
		String s = "hello welcome to the java class";
		String res = "";
		List<String> list = mySplit(s);
		for(int i=0;i<list.size();i++) {
			String word = list.get(i);
			if(word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
				res += (char)((int)word.charAt(0) - 32);
			}else {
				res += word.charAt(i);
			}
		}
		System.out.println(res);
	}

}
