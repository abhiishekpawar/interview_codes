package org.penttagon.Numbers;

public class SumOfDigits {
	public static void main(String[] args) {
		int n  =123;
		
		int rem=0,sum = 0;
		while(n>0) {
			rem = n%10;
			sum = sum+rem;
			n = n /10;
		}
		System.out.println(sum);
	}

}
