package core.java.codes.OOP;

class A{
	void A() {
		System.out.println("This is class A");
	}
	
}

class B extends A{
	void B() {
		System.out.println("This is class B");
	}
}

class C extends A{
	void C() {
		System.out.println("This is class C");
	}
}

public class Hirarchial_inheritence {
	
	public static void main(String[] args) {
		C cobj = new C();
		cobj.A();
		cobj.C();
		
		B objb  = new B();
		objb.A();
		objb.B();
		
		
	}

}
