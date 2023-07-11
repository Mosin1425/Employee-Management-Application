package com.spring.entity;

import javax.persistence.*;
import java.util.Date;

@SuppressWarnings("ALL")
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private Date dob;
	private int salary;
	private String contact;
	private String email;
	private String address;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "p_id")
	private Project project;

	public Employee() {
		super();
	}

	public Employee(String name, Date dob, int salary, String contact, String email, String address, Project project) {
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.project = project;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", contact=" + contact
//				+ ", email=" + email + ", address=" + address + "]";
//	}
	
	
}
