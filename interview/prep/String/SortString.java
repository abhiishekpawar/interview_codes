package interview.prep.String;

public class SortString {
	public static void main(String[] args) {
		String s = "abhishek";
		
		char[] ch = s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		for(char c:ch)
			System.out.print(c);
	}

}
