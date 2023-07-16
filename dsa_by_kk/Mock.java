package dsa_by_kk;

public class Mock {
	static String mobile_model_name = "Redmi";
//	Sring mobile() {
//		int mobile_cost = 20000;
//		String mobile_color= "silver";
//		//System.out.println("mobile cost is "+mobile_cost +" "+" and mobile color is "+mobile_color);
//		System.out.printf(" mobile cost is %d %n color is %s",mobile_cost, mobile_color );
//	}
	
//	void mobile(int mobile_cost,String mobile_color) {
//		System.out.println("Mobile cost is "+mobile_cost+" "+" and mobile color is "+mobile_color);
//	}
	
	 String mobile(int mobile_cost,String mobile_color) {
		
		String res = "Mobile cost is" + mobile_cost+" "+"\nmobile color is "+mobile_color;
		
		return res;
	}
	
	public static void main(String[] args) {
		//System.out.println(mobile_model_name);
		Mock d1 = new Mock();
		System.out.println(d1.mobile(2000,"black"));
	}
	
}