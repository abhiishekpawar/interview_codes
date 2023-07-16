 package interview.prep.String;

public class Anagram {
	public static void main(String[] args) 
	{
		String s1  = "abb";
		String s2  = "bab";
		
		int arr[] = new int[256];
		for(int i=0;i<s1.length();i++) {
			arr[s1.charAt(i)]++;
			arr[s2.charAt(i)]--;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println(false);
				System.exit(0);
			}
		}
		System.out.println(true);
	}
}
