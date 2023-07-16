package interview.prep.String;

//Concat orginal String 2 times and check if conacted string contains rotated string



public class RotationOfEachOther {
	public static void main(String[] args) {
		String orginal_string = "abcd";
		String rotated_string = "cddb"; // Rotated by 2 charcater
		
		String concat = orginal_string + orginal_string;
		if(concat.contains(rotated_string)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
