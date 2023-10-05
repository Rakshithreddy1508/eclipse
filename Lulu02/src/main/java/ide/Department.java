package ide;

import java.util.Objects;

public class Department {
	public String name;
	public String dept;
	public float salary;

	// Getters and Setters

	public String getName() {
		return name;
	}

	// this refers to the object reference of same class
	public void setName(String name) {
		this.name = name; // variables
		this.setDept(name);  // methods
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	// equal() and Hashcode

	@Override
	public int hashCode() {
		return Objects.hash(dept, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Department other = (Department) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(name, other.name)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}

	// to string method

	@Override
	public String toString() {
		return "Department [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

	// Parametric Constructor

	public Department(String name, String dept, float salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	// Default Constructor

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
}
