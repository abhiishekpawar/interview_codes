package interview.prep.String;

public class EvenLeghtWords {
	public static void main(String[] args) {
		String s = "hello welcome to the core java class";
		
		String words[] = s.split(" ");
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			if(word.length() %2 ==0) {
				System.out.print(word+" ");
			}
		}
	}

}
