
public class customerrunner {				//class

	public static void main(String[] args) {       //method

		Address homeaddress = new Address("line1", "Banglore", "503366");      //instances or Objects
		customer customer = new customer("Ram", homeaddress);

		Address workaddress = new Address("line1 for work ","Bellary","583102");
		customer.setWorkaddress(workaddress);

		System.out.println(customer);			// Printing  Values.
	}

}
