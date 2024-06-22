package com.rodrigolee.crud_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rodrigolee.crud_spring.model.Course;
import com.rodrigolee.crud_spring.repository.CourseRepositoy;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepositoy courseRepositoy) {
		return args -> {
			courseRepositoy.deleteAll();
			Course course = new Course();
			course.setName("Java Spring");
			course.setCategory("Back-end");
			courseRepositoy.save(course);
		};
	}
}
