package core.java.codes.OOP;

class Student {

	private String fname;

	private String lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}

public class Encapsulation {
	public static void main(String[] args) {
	Student s = new Student();
	s.setFname("Abhishek");
	s.setLname("Pawar");
	
	System.out.println(s.getFname());
	System.out.println(s.getLname());
	}

}
