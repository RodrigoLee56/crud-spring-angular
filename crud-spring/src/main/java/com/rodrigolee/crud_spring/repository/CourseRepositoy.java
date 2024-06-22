package com.rodrigolee.crud_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigolee.crud_spring.model.Course;

@Repository
public interface CourseRepositoy extends JpaRepository<Course, Long>{
	
}
