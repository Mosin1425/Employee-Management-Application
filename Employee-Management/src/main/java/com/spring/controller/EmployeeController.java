package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.entity.Employee;
import com.spring.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/")
	public String startingPage(){
		return "home";
	}

	@GetMapping("/employees")
	public String getEmployee(Model m) {
		m.addAttribute("employees", employeeService.getAllEmployee());
		return "employees";
		
	}
	
	@GetMapping("/employees/new")
	public String newEmployee(Model m) {
		Employee employee = new Employee();
		m.addAttribute("employee", employee);
		return "new_employee";
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("Employee") Employee employee) {
		employeeService.saveAll(employee);
		return "redirect:/employees";
	}
	
	@GetMapping("/employees/edit/{id}")
	public String editEmployee(@PathVariable int id, Model m) {
		m.addAttribute("employee", employeeService.getEmployeeById(id));
		return "edit_employee";
	}

	@PostMapping("/employees/{id}")
	public String updateEmpl(@PathVariable int id, @ModelAttribute("employee") Employee employee, Model m) {
		Employee e = employeeService.getEmployeeById(id);
		e.setId(employee.getId());
		e.setName(employee.getName());
		e.setDob(employee.getDob());
		e.setSalary(employee.getSalary());
		e.setContact(employee.getContact());
		e.setEmail(employee.getEmail());
		e.setAddress(employee.getAddress());
		e.setProject(employee.getProject());
		
		employeeService.updateEmployee(e);
		return "redirect:/employees";
	}
	
	@GetMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployeeById(id);
		return "redirect:/employees";
	}
}
