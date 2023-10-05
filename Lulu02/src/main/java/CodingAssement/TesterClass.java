package CodingAssement;

import java.util.LinkedList;

public class TesterClass {

	public static void main(String[] args) {

		LinkedList<AgeClass> bucketAgeClass = new LinkedList<AgeClass>();
		AgeClass A1 = new AgeClass(25);
		AgeClass A2 = new AgeClass(23);
		bucketAgeClass.add(A1);
		bucketAgeClass.add(A2);

		bucketAgeClass.add(new AgeClass(18));
		bucketAgeClass.add(new AgeClass(35));
		bucketAgeClass.add(new AgeClass(40));



		System.out.println(bucketAgeClass.size());
		System.out.println(bucketAgeClass.indexOf(A2));
		System.out.println(bucketAgeClass.remove(A1));
		System.out.println(bucketAgeClass.toString());
		System.out.println(bucketAgeClass.toArray());


		System.out.println("-------------------*****---------------------");
		System.out.println("Integer Records added");
		System.out.println(bucketAgeClass);



		System.out.println("-------------------*****---------------------");
		for(AgeClass ac : bucketAgeClass) {
			System.out.println(ac);
		}

	}

}
