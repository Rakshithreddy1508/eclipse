package com.lulu.lulu_Recap_MS3_Employee.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="employee_Details")
public class Employee {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)

	int id;
		String name;
		String Dept;
		float Salary;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int id, String name, String dept, float salary) {
			super();
			this.id = id;
			this.name = name;
			Dept = dept;
			Salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", Dept=" + Dept + ", Salary=" + Salary + "]";
		}
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
		public String getDept() {
			return Dept;
		}
		public void setDept(String dept) {
			Dept = dept;
		}
		public float getSalary() {
			return Salary;
		}
		public void setSalary(float salary) {
			Salary = salary;
		}
		@Override
		public int hashCode() {
			return Objects.hash(Dept, Salary, id, name);
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
			return Objects.equals(Dept, other.Dept)
					&& Float.floatToIntBits(Salary) == Float.floatToIntBits(other.Salary) && id == other.id
					&& Objects.equals(name, other.name);
		}



}