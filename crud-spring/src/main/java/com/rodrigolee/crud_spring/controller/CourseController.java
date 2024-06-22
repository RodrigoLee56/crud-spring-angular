package com.rodrigolee.crud_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigolee.crud_spring.model.Course;
import com.rodrigolee.crud_spring.repository.CourseRepositoy;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {
	
	private CourseRepositoy courseRepositoy;

	@GetMapping
	public List<Course> list() {
		return courseRepositoy.findAll();
	}

}
