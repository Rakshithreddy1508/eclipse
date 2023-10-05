import java.math.BigDecimal;

public class Employee extends Person{		// Inheritance  Method


	private String title;
	private String employeename;
	private char employeeGrade;
	private BigDecimal Salary;

	public Employee(String name, String title) {
		 System.out.println("Employee Constructor");
		}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public BigDecimal getSalary() {
		return Salary;
	}
	public void setSalary(BigDecimal salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return super.toString() + "Employee [title=" + title + ", employeename=" + employeename + ", employeeGrade=" + employeeGrade
				+ ", Salary=" + Salary + "]";
	}


}
