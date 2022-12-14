package com.zng;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zng.Entity.Employee;
import com.zng.service.EmployeeService;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(EmployeeManagementApplication.class, args);
		System.out.println("Springboot Running!!!");
		EmployeeService service = container.getBean(EmployeeService.class);
		/*List<Employee>empList = service.findAllEmployees();
		for (Employee employee : empList) {
			System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getAdd()+"\t"+employee.getPhoneNo()+"\t"+employee.getEmail()+"\t"+employee.getSalary());
			
		}*/
		
		
	}

}
