
public class Person {

	private String name;
	private String email;
	private String ContactNumber;


	public Person() {
	 System.out.println("Person Constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", ContactNumber=" + ContactNumber + "]";
	}


}
