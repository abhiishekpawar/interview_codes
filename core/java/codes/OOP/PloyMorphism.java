package core.java.codes.OOP;

class Parent{
	
	void add(int i) {
		System.out.println("Adding "+i);
	}
	
	//Method overloading
	void add(int i,int j) {
		System.out.println("adding "+i+" "+j);
	}
	
	void sub(int i,int j) {
		System.out.println(i-j);
	}
}

class Child extends Parent{
	
	@Override
	void sub(int i,int j) {
		System.out.println("i-j = "+(i-j));
	}
}

public class PloyMorphism {
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.add(1);
		p.add(1,2);
		
		Child c = new Child();
		c.sub(2, 1);
	}
	

}
