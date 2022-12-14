package com.zng.controller;


import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zng.Entity.Employee;
import com.zng.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/view")
	public List<Employee>findAllEmployees(){
		return service.findAllEmployees();
	}
	@GetMapping("/get/{id}")
	public Employee findEmployeeById(@PathVariable int id) {
		return service.findEmployeeById(id);
	}
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeByID(@PathVariable int id) {
		service.deleteEmployeeById(id);
		
	}
	

}
