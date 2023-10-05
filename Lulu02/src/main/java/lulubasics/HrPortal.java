package lulubasics;

public class HrPortal {

	String EmployeeName;
	String Deptname;
	int Salary;


	void AddEmployee(String n , String d , int s ) {
		EmployeeName = n ;
		Deptname = d;
		Salary = s;


		System.out.println("Employee Name : " +n);
    	System.out.println("Dept Name : " +d);
    	System.out.println("Salary  : " +s);

	}
	    void DisplayEmployee() {

	    	if(Salary>=50000) {
	    		System.out.println("Great job");
	    	} else {
	    		System.out.println("Appraisal is coming soon");
	    	}
	    }
	  HrPortal(){
		  System.out.println("Enter the employee details");
	  }
	  HrPortal(String n , String d , int s) {
		  EmployeeName = n ;
		  Deptname = d;
	      Salary = s;
	  }
}
