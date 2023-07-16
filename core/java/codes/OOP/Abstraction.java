package core.java.codes.OOP;

abstract class SimCard{
	
	abstract void call();
	
}

class Jio extends  SimCard{

	@Override
	void call() {
		System.out.println("Calling with jio sim");
		
	}
	
}

class Airtel extends SimCard{

	@Override
	void call() {
		System.out.println("Calling with Airtel sim");
	}
	
}

public class Abstraction {
	public static void main(String[] args) {
		
		SimCard s = new Jio();
		s.call();
		SimCard s1 = new Airtel();
		s1.call();
	} 

}
