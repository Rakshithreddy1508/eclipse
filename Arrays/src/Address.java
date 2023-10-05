
	public class Address { 		// Class
	private String line1;
	private String city;
	private String zip;


	public Address(String line1, String city, String zip) {  //Method
		super();
		this.line1 = line1;     //instance or Object
		this.city = city;
		this.zip = zip;


	}
  @Override
  		public String toString() {                  //Printing Values or accessing member through reference variable
	  	return line1 + " " + city + " " + zip;

  }
}
