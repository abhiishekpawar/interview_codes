package org.penttagon.Numbers;

public class LeapYear {
	public static void main(String[] args) {
		int n = 1990;
		
		if((n%400) == 0)
			System.out.println(true);
		else if(n%100 != 0 && n%4 == 0)
			System.out.println(true);
		else
			System.out.println(false);
				

	}

}
