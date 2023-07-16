package org.penttagon.Numbers;

import java.util.*;

public class ArmSstringNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n,len = 0;
		while(n>0) {
			len++;
			n = n/10;
		}
		n = temp;
		
		int rem=0,sum = 0;
		while(n>0) {
			rem = n%10;
			sum += Math.pow(rem, len);
			n = n/10;
		}
		System.out.println(sum);
		if(sum == temp)
			System.out.println(true);
		else
			System.out.println(false);
		
	}

}
