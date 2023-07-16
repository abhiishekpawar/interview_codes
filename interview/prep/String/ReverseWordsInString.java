package interview.prep.String;

public class ReverseWordsInString {
	public static void main(String[] args) {
		
		String s = "Hello welcome to the java class"; // op : class java the to welcome Hello
		
		String[] words = s.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}
	}

}
