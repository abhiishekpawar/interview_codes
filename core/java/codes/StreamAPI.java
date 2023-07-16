package core.java.codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class StreamAPI {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//return square of each number in list
		list.stream().map(n -> n*n).forEach(n -> System.out.println(n));
		
		System.out.println("---------------------------------------");
		
		//return odd number is list
		list.stream().filter(n -> n%2 == 1).forEach(n -> System.out.println(n));
		
		
	}

}
