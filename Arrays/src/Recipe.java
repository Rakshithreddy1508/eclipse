
public class Recipe extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the Raw Materials");
		System.out.println("Get the utensils");

	}

	@Override
	void doTheDish() {
		System.out.println("Do The Dish ");


	}

	@Override
	void cleanup() {
		System.out.println("Clkeanup the kitchen and Utensils");
	}


}
