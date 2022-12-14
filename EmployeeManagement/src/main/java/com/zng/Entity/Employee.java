package com.zng.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emptable")
public class Employee {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_add")
	private String add;
	@Column(name="emp_phone")
	private int phoneNo;
	@Column(name="emp_email")
	private String email;
	@Column(name="emp_salary")
	private double salary;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String add, int phoneNo, String email, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.phoneNo = phoneNo;
		this.email = email;
		this.salary = salary;
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", salary=" + salary + "]";
	}
	

}
