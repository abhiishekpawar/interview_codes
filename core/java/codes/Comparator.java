package core.java.codes;
import java.util.*;

class Student {
	private String name;

	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

class AgeComprator implements java.util.Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getAge() - s2.getAge();
	}
	
}


public class Comparator {
	
	public static void main(String[] args) {
		ArrayList<Student>  list = new ArrayList<>();
		list.add(new Student("abhi",20));
		list.add(new Student("pawar",18));
		list.add(new Student("vicky",19));
		list.add(new Student("rahul",11));
		list.add(new Student("boou",12));
		
		Collections.sort(list, new AgeComprator());
		for(Student s:list)
			System.out.println(s.getAge());
		
	}
}
