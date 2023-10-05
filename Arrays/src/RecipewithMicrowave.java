
public class RecipewithMicrowave extends AbstractRecipe{



	@Override
	void getReady() {

		System.out.println("====================================");


		System.out.println("Get the Raw Materials and Utinsils");
		System.out.println("Switch on the Microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("Get stuff Ready and put it in Microwave");
		System.out.println("do the dish");
	}

	@Override
	void cleanup() {
		System.out.println("Switch off the Microwave");
		System.out.println("Cleanup the Kitchen");

	}

}

