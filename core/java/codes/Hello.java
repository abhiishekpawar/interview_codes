package core.java.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	
	private String name;
	
	private int id;

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
}

class NameCompator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return (e1.getName().compareTo(e2.getName()));
	}
	
}
public class Hello {
	
	public static void main(String[] args) {
		List<Employee>  list = new ArrayList<>();
		list.add(new Employee("Zebra",12));
		list.add(new Employee("Anoj",14));
		list.add(new Employee("Rahul",12));
		list.add(new Employee("Huli",12));
		
		Collections.sort(list, new NameCompator());
		for(Employee e:list)
			System.out.println(e.getName());
		
	}

}
