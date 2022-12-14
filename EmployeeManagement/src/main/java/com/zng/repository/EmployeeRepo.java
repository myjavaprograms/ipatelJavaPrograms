package com.zng.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zng.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
