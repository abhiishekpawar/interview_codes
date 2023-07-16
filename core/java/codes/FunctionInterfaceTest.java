package core.java.codes;

@FunctionalInterface
interface A {

	void add();

}

public class FunctionInterfaceTest {

	public static void main(String[] args) {

		A obj = new A() {
			public void add() {
				System.out.println("Adding");
			}
		};
		obj.add();

	}

}
