package core.java.codes;

interface B{
	
	int add(int i,int j);
}

public class LambdaExpression {
	
	public static void main(String[] args) {
		
		B obj = (i,j) ->{
			return i+j; 
		};
		System.out.println(obj.add(3,2));
	}

}
