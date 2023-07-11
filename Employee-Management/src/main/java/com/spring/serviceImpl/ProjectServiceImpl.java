package com.spring.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.entity.Project;
import com.spring.repository.ProjectRepo;
import com.spring.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{

	private ProjectRepo projectRepository;
	
	public ProjectServiceImpl(ProjectRepo projectRepository) {
		super();
		this.projectRepository = projectRepository;
	}



	@Override
	public List<Project> getAllProject() {
		return projectRepository.findAll();
	}



	@Override
	public Project saveAll(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public Project getProjectById(int id) {
		return projectRepository.findById(id).get();
	}



	@Override
	public Project updateProject(Project project) {
		return projectRepository.save(project);
	}



	@Override
	public void deleteProjectById(int id) {
		projectRepository.deleteById(id);
	}

}
