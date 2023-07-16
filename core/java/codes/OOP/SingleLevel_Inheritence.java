package core.java.codes.OOP;

class Animal{
	 public void eat() {
		System.out.println("Animal is eatig");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("Dog is barking");
	}
}

public class SingleLevel_Inheritence {
	public static void main(String[] args) {
		
		Dog d  = new Dog();
		d.eat();
		d.bark();
	}

}
