package interview.prep.String;

public class Freequeny {
	public static void main(String[] args) {
		String s = "Abhiiii";
		int[] arr = new int[256];
		
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >0)
			System.out.println((char)i+" "+arr[i]);
		}
	}

}
