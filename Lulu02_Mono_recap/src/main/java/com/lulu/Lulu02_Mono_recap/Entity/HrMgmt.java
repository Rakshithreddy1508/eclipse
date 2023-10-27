package com.lulu.Lulu02_Mono_recap.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="HR_Details")
public class HrMgmt {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
		int id;
		String name;
		float Salary;
		public HrMgmt() {
			super();
			// TODO Auto-generated constructor stub
		}
		public HrMgmt(int id, String name, float salary) {
			super();
			this.id = id;
			this.name = name;
			Salary = salary;
		}
		@Override
		public String toString() {
			return "HrMgmt [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
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
		public float getSalary() {
			return Salary;
		}
		public void setSalary(float salary) {
			Salary = salary;
		}
		@Override
		public int hashCode() {
			return Objects.hash(Salary, id, name);
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
			HrMgmt other = (HrMgmt) obj;
			return Float.floatToIntBits(Salary) == Float.floatToIntBits(other.Salary) && id == other.id
					&& Objects.equals(name, other.name);
		}



}
