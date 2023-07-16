package org.penttagon.Numbers;

public class Pallindrome {
	public static void main(String[] args) {
		int n = 323;
		int rem = 0, sum = 0;
		int temp = n;
		
		while(n>0) {
			rem = n%10;
			sum = (sum*10)+rem;
			n = n/10;
		}
		System.out.println((temp == sum)?"yes":"no");
	}

}
