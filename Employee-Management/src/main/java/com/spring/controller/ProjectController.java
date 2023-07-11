package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.entity.Project;
import com.spring.service.ProjectService;

@Controller
public class ProjectController {

	private ProjectService projectService;
	
	public ProjectController(ProjectService projectService) {
		super();
		this.projectService = projectService;
	}

	@GetMapping("/projects")
	public String getAllProjects(Model m) {
		m.addAttribute("projects",projectService.getAllProject());
		return "projects";
	}
	
	@GetMapping("/projects/new")
	public String newProject(Model m) {
		Project project = new Project();
		m.addAttribute("project",project);
		return "new_project";
	}
	
	@PostMapping("/projects")
	public String saveProject(@ModelAttribute("Project") Project project) {
		projectService.saveAll(project);
		return "redirect:/projects";
	}

	@GetMapping("/projects/edit/{id}")
	public String editProject(@PathVariable int id, Model m) {
		m.addAttribute("project", projectService.getProjectById(id));
		return "edit_project";
	}
	
	@PostMapping("/projects/{id}")
	public String updateProjct(@PathVariable int id, @ModelAttribute("project") Project project, Model m) {
		Project p = projectService.getProjectById(id);
		p.setId(project.getId());
		p.setTitle(project.getTitle());
		p.setDescription(project.getDescription());
		p.setStartDate(project.getStartDate());
		p.setEndDate(project.getEndDate());

		projectService.updateProject(p);
		return "redirect:/projects";
	}
	
	@GetMapping("/projects/{id}")
	public String deleteEmployee(@PathVariable int id) {
		projectService.deleteProjectById(id);
		return "redirect:/projects";
	}
}
