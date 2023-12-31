package Assgiments;

import java.util.Objects;

public class Employee {

	String Name , Desigination ;
	int Age;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesigination() {
		return Desigination;
	}
	public void setDesigination(String desigination) {
		Desigination = desigination;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}

	public Employee(String name, String desigination, int age) {
		super();
		Name = name;
		Desigination = desigination;
		Age = age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(Age, Desigination, Name);
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
		return Age == other.Age && Objects.equals(Desigination, other.Desigination) && Objects.equals(Name, other.Name);
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Desigination=" + Desigination + ", Age=" + Age + "]";
	}


}
