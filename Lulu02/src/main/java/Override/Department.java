package Override;

public class Department extends Employee {

	String Profile ;
	int floor ;
	String employee , Software ;

	public void displayrec(String p , int f) {

			Employee e = new Employee();
			e.addemploy("Ram", "R&D", 500000);
			e.showdata();

		Profile = p ;
		floor = f ;
          System.out.println("employee rec");
          System.out.println("Employee Profile: " +Profile);
          System.out.println("Office Floor : "+floor);
	}

	@Override
	public void showdata() {
		 System.out.println("Employee details given!  overwritten ");
	 }

	public void addrec() {
		if(employee == Software) {
			System.out.println("Great job! ur in great dept ");
		}
	}

}
