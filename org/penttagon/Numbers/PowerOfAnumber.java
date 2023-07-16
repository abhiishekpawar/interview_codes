package org.penttagon.Numbers;

public class PowerOfAnumber {
	public static int pow(int a,int b) {
		int pow = 1;
		for(int i=0;i<b;i++) {
			pow = pow*a;
		}
		return pow;
	}
	
	public static void main(String[] args) {
		System.out.println(pow(4,3));
	}

}
