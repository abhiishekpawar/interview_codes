package org.penttagon.Numbers;

public class PerfectNumber {
	public static boolean isPerfect(int n) {
		int sum =0;
		for(int i=1;i<n;i++) {
			if((n%i) == 0) {
				sum += i;
			}
		}
		if(sum == n)
			return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPerfect(6));
		
	}

}
