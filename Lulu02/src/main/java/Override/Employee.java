package Override;

public class Employee {

	 String Name , Dept ;
	 float Salary;

	 public void addemploy(String n ,String d , float s) {

		 Name = n ;
		 Dept = d ;
		 Salary = s ;

		 	System.out.println("Employee Details added");
	 }

	 public void showdata() {
		 System.out.println("Employee Name : "+Name);
		 System.out.println("Employee Dept : "+Dept);
		 System.out.println("Employee name : "+Salary);

		 System.out.println("Employee Details Shown");
	 }

}
