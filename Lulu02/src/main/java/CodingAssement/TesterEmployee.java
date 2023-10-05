package CodingAssement;

import java.util.ArrayList;

public class TesterEmployee {

	public static void main(String[] args) {

		// Bucket of stroing Employee Object
		ArrayList<Employee> bucketEmployee = new ArrayList<Employee>();
		Employee E1 = new Employee("Ratanam","Cs",25);
		Employee E2 = new Employee("Naga","EC",22);
		bucketEmployee.add(E1);
		bucketEmployee.add(E2);

		bucketEmployee.add(new Employee("Venky","Mech",28));
		bucketEmployee.add(new Employee("Abhi","Civil",20));
		bucketEmployee.add(new Employee("Madhan","R&D",18));

		System.out.println(bucketEmployee.size());
		System.out.println("Records added to Collection");
		System.out.println(bucketEmployee);

		System.out.println("--------------------*****---------------------");

			for(Employee d: bucketEmployee ) {
				System.out.println(d);

			}



	}

}
