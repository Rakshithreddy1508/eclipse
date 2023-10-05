package StremConcept;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		////////// definition /////////
		//Calculator ca = (x) -> (x * x); // Lambda expressions -
										// Implementation -squareIt

		// (input )->( Method Body )



		//////////////////////// how we call them//////
		//int result = ca.sqareIt(10);

		//System.out.println("the final Result is " + result);

		Calculator ca1 = (int num) -> {
			System.out.println("Lambda getting implemented");
		    return 	num * num;


		};
  }
}
