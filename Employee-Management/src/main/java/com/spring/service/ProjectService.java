package com.spring.service;

import java.util.List;

import com.spring.entity.Project;

public interface ProjectService {

	List<Project> getAllProject();
	Project saveAll(Project project);
	
	Project getProjectById(int id);
	Project updateProject(Project project);
	
	void deleteProjectById(int id);
}
