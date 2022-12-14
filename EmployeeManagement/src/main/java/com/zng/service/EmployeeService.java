package com.zng.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.zng.Entity.Employee;
import com.zng.repository.EmployeeRepo;
@Service
@Component
public class EmployeeService {
	@Autowired
	EmployeeRepo empRepo;
	
	public List<Employee>findAllEmployees(){
		return empRepo.findAll();	
	}
	public Employee findEmployeeById(int id) {
		Optional<Employee>optional = empRepo.findById(id);
		return optional.get();	
	}
	public Employee addEmployee(Employee employee) {
		return empRepo.save(employee);
	}
	public void deleteEmployeeById(int id) {
		empRepo.deleteById(id);
	}

}
