package Assgiments;

import java.util.ArrayList;

public class HR_Manager {

	ArrayList<Employee> Em = new ArrayList<Employee>();

	public void Process_Records() {

		Em.add(new Employee("Ravi","R&D",25));
		Em.add(new Employee("Hari","Developer",28));
		Em.add(new Employee("Amith","E&E",24));
		Em.add(new Employee("Krishna","Mech",32));
		Em.add(new Employee("Madan","Civil",25));

		System.out.println("Records added ");
		for(Employee e :Em) {
			System.out.println(e);
		}

	}

}
