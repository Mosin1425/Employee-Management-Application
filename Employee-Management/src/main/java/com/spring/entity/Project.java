package com.spring.entity;

import javax.persistence.*;

@Entity
@Table(name="project_data")
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String title;
	private String description;
	private String startDate;
	private String endDate;

	public Project(String title, String description, String startDate, String endDate) {
		super();
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Project() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	

	
}
