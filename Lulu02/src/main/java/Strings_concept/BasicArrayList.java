package Strings_concept;

import java.util.ArrayList;

public class BasicArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is Objject
		//Employye as Objects
		//Account as object

		//Apple- Object

		//Basket - Collection  can only Accept (Apple --String)
		ArrayList<String> bucketString= new ArrayList<String>();
		bucketString.add("Ram");
		bucketString.add("Ajith");
		bucketString.add("Abhi");
		bucketString.add("Manju");
		bucketString.add("Rocky");

		//Processing
		System.out.println(bucketString);
		System.out.println(bucketString.get(0));
		System.out.println(bucketString.get(3));
		//System.out.println(bucketString.isEmpty());
		System.out.println(bucketString.set(2, "Lulu"));

		System.out.println("----------------------------");

		System.out.println(bucketString.clone());
		System.out.println(bucketString.hashCode());
		System.out.println(bucketString.remove(0));
		System.out.println(bucketString.toArray());


		System.out.println("----------------------------");
		System.out.println(bucketString);


	}
}


