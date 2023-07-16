package core.java.codes.OOP;

class A1{
	public A1() {
		System.out.println("in A1");
	}
	
	public A1(int i){
		System.out.println("int int A1");
	}
}

class B1 extends A1{
	public B1() {
		//super() -----> Added by the JVM
		System.out.println("in B1");
	}
	
	public B1(int i) {
		super(i); // -------------->Added by us
		System.out.println("int in B1");
	}
}
public class Super {
	public static void main(String[] args) {
		B1 b = new B1(2);
	}
	
	

}
