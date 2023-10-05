package StremConcept;

@FunctionalInterface
public interface InterfaceOne {// Adjective camelcase


	//before 1.8

	int data=100;  // final -initialization must

	abstract void process();// only declarations no definitions needed
	               // abstract -incomlete

	//after 1.8
	//interface more powerful
	 // method definition permitted

//	 1)static method
	static void disp() {
		System.out.println("I got rights to have definitions");
	}

	default void show() {
		System.out.println("I got rights to have definitions");
		System.out.println("I am default method");

	}

	}


//	2) default method

 //Absstract method still there
 //Functional interface -popular
