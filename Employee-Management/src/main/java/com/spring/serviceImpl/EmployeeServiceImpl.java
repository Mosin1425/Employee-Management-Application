package com.spring.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.entity.Employee;
import com.spring.repository.EmployeeRepo;
import com.spring.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepo employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepo employeeRepository) {
		this.employeeRepository = employeeRepository;
	}


	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee saveAll(Employee employee) {
		return employeeRepository.save(employee);
	}


	@Override
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).get();
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}


	@Override
	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		
	}

}
