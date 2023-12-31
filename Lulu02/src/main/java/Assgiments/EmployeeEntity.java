package Assgiments;

import java.util.Objects;

public class EmployeeEntity {
	int id;
	String name;
	int age;
	double salary;
	String designation;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	public EmployeeEntity(int id, String name, int age, double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, designation, id, name, salary);
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
		EmployeeEntity other = (EmployeeEntity) obj;
		return age == other.age && Objects.equals(designation, other.designation) && id == other.id
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}



}