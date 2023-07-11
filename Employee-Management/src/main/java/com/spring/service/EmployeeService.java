package com.spring.service;

import java.util.List;

import com.spring.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	
	Employee saveAll(Employee employee);
	
	Employee getEmployeeById(int id);
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(int id);
}
