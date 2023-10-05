package StremConcept;


//Override

@FunctionalInterface
public interface Calculator {

	//only 1 Abstract Method expected

	abstract int sqareIt(int num); //Abstract Method
	//abstract void muliplyIt(); //Abstract Method
	//return type -input num
//any parmeter ..??? No


	//static -dont care
	static void pro() {
		System.out.println("any Operations");
	}

	//default - dont care 	




}