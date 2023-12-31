package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer>{

}
