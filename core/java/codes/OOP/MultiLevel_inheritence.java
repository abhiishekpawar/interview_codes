package core.java.codes.OOP;

class Company{
	public void creates() {
		System.out.println("This company creates anything");
	}
}

class Mobile extends Company{
	public void createMobile() {
		System.out.println("Creating a mobile");
	}
}

class Laptop extends Mobile{
	public void creatLaptop() {
		System.out.println("Creating a laptop");
	}
}

public class MultiLevel_inheritence {
	
	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.creates();
		l.creatLaptop();
		l.createMobile();
	}

}
