package ArrayCollections;

import java.util.Objects;


public class Employee {

	String name;
	String dept;
	int age;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public Employee(String name, String dept, int age) {
		super();
		this.name = name;
		this.dept = dept;
		this.age = age;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dept, name);
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
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(dept, other.dept) && Objects.equals(name, other.name);
	}

}
