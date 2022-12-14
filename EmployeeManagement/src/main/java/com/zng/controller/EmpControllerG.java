package com.zng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zng.Entity.Employee;
import com.zng.service.EmployeeService;

@Controller
public class EmpControllerG {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/")
	public String home(Model m) {
		List<Employee> list = service.findAllEmployees();
		m.addAttribute("emp",list);
		return "index";
	}
	@GetMapping("/add")
	public String addEmp() {
		return "add_emp";
	}
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee employee) {
		System.out.println(employee);
		service.addEmployee(employee);
		return "add_emp";
		
	}

}
