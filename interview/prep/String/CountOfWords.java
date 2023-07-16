package interview.prep.String;

public class CountOfWords {
	public static void main(String[] args) {
		String s = "welcomr to java world";
		String[] words = s.split(" ");
		int count = 0;
		for(int i=0;i<words.length;i++) {
			count++;
		}
		System.out.println(count);
	}

}
