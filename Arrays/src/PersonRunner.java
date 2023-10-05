
public class PersonRunner {

	public static void main(String[] args) {

		/*Person person = new Person();
		person.setName("Rocky");
		person.setEmail("Rocky123@gmail.com");
		person.setContactNumber("1234567890");
		String value = person.toString();
		//System.out.println(value);
		System.out.println(person);
		*/


		Employee employee = new Employee("Ram","PM" );
		//employee.setName("Rocky");
		employee.setEmail("Rocky123@gmail.com");
		employee.setContactNumber("1234567890");
		employee.setTitle("PM");
		employee.setEmployeeGrade('A');
		System.out.println(employee);

	}

}
