package org.penttagon.Numbers;

public class NPrimeNumbers {
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i ==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		int n = 12;
		for(int i=2;i<=12;i++){
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}

}
