package ArrayCollections;

import java.util.ArrayList;

public class TesterCollection {

	public static void main(String[] args) {

		ArrayList<Employee> bucketEmployee = new ArrayList<Employee>();
		System.out.println(bucketEmployee.size());
		Employee e1 = new Employee("Ram","R&D",21);
		Employee e2 = new Employee("Ravi","R&D",21);

		bucketEmployee.add(e1);
		bucketEmployee.add(e2);

		bucketEmployee.add(new Employee("Nagasree", "Sw",23));
		bucketEmployee.add(new Employee("Nanditha", "Sw",25));
		bucketEmployee.add(new Employee("r","sw",24));



		System.out.println(bucketEmployee.size());

		System.out.println("Records in the collection is ");
		System.out.println(bucketEmployee);
		System.out.println("////////*************///////////");
		for(Employee e : bucketEmployee) {
			System.out.println(e);

		}
	}
}

