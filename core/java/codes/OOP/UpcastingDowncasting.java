package core.java.codes.OOP;

class Parent1{
	void eat() {
		System.out.println("parent is eating");
	}
	
	void sleep() {
		System.out.println("parent is sleeping");
	}
}

class child1 extends Parent1{
	void eat() {
		System.out.println("child is eating");
	}
	
	void sleep() {
		System.out.println("child is sleeping");
	}
}

public class UpcastingDowncasting {
	
	public static void main(String[] args) {
		
		//upcasting
//		Parent1 p = new child1();
//		p.eat();
//		p.sleep();
		
		//downcasting
		
		child1 ch = (child1)new Parent1();
		ch.sleep();
		ch.eat();
	}
	

}
