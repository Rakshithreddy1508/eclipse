package Assgiments;

import java.util.ArrayList;
import java.util.Collections;

public class Tester {

	public static void main(String[] args) {

	ArrayList<Student> Sr = new ArrayList<Student>();

	Sr.add(new Student(10, "Pratheesh" , "Bellary"));
	Sr.add(new Student(25, "Suresh" , "Hubbali"));
	Sr.add(new Student(11, "Ram" , "Bangalore"));
	Sr.add(new Student(01, "Abhi" , "Mysore"));

	System.out.println("Unsorted Details");

	 for(int i = 0; i<Sr.size(); i++) {
		System.out.println(Sr.get(i));
		}

		Collections.sort(Sr , new SortByRollNo());

		System.out.println();
		System.out.println("Sorted  by RollNo");

		for(int i = 0; i<Sr.size(); i++) {
			System.out.println(Sr.get(i));



	}


	}

}


