package com.lulu.lulu_Recap_MS3_Employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulu.lulu_Recap_MS3_Employee.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {


}
