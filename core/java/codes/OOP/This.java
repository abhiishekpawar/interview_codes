package core.java.codes.OOP;

public class This {
	
	private String name;
	
	private int age;
	
	public void setName(String name) {
		this.name = name; // ----> assigning parametre name to instence variable
	}
	
	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		
		This s = new This();
		s.setName("Abhi");
		System.out.println(s.getName());
		
	}
}
