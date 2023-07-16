package interview.prep.String;

public class CaseChange {
	public static void main(String[] args) {
		String s = "abHIsHeK";
		String res ="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if((int)ch >=65 && (int)ch <=90) {
				ch = (char)((int)ch+32);
				res+=ch;
			}else {
				ch = (char)((int)ch - 32);
				res+=ch;
			}
			
		}
		
		System.out.println(res);
		
//		System.out.println((int)'A'+" "+(int)'Z');
//		System.out.println((int)'a'+" "+(int)'z');
	}

}
